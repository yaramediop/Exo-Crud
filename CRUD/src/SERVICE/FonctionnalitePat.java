package SERVICE;

import java.sql.*;
import java.util.Scanner;

public class FonctionnalitePat {

    private Connection con;
    private Scanner sc = new Scanner(System.in);

    // ========================
    // CONSTRUCTEUR
    // ========================
    public FonctionnalitePat() {
        try {
            // Charger le driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gestion_medicale?useSSL=false&serverTimezone=UTC",
                    "root",
                    ""
            );

            System.out.println("✅ Connexion réussie à la base de données !");
        } catch (Exception e) {
            System.out.println("❌ Erreur connexion : " + e.getMessage());
        }
    }

    // ========================
    // 1️⃣ AJOUTER UN PATIENT
    // ========================
    public void ajouterPatient() {
        try {
            System.out.println("\n--- AJOUT D'UN PATIENT ---");
            System.out.print("Nom : ");
            String nom = sc.nextLine();

            System.out.print("Prénom : ");
            String prenom = sc.nextLine();

            System.out.print("Sexe (M/F) : ");
            String sexe = sc.nextLine();

            System.out.print("Age : ");
            int age = sc.nextInt();
            sc.nextLine(); // Consommer le retour à la ligne

            // Utilisation de PreparedStatement pour la sécurité
            String sql = "INSERT INTO patient(nom, prenom, sexe, age) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, sexe);
            ps.setInt(4, age);

            ps.executeUpdate();
            System.out.println("✅ Patient ajouté avec succès !");

        } catch (SQLException e) {
            System.out.println("❌ Erreur ajout : " + e.getMessage());
        }
    }

    // ========================
    // 2️⃣ AFFICHER LES PATIENTS
    // ========================
    public void afficherPatients() {
        try {
            String sql = "SELECT * FROM patient";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n--- LISTE DES PATIENTS ---");
            System.out.println("ID | Nom | Prénom | Sexe | Age");
            System.out.println("-----------------------------------");
            
            while (rs.next()) {
                System.out.println(
                        rs.getInt("idP") + " | " +
                        rs.getString("nom") + " | " +
                        rs.getString("prenom") + " | " +
                        rs.getString("sexe") + " | " +
                        rs.getInt("age")
                );
            }
        } catch (SQLException e) {
            System.out.println("❌ Erreur affichage : " + e.getMessage());
        }
    }

    // ========================
    // 3️⃣ MODIFIER UN PATIENT
    // ========================
    public void modifierPatient() {
        try {
            System.out.print("\nEntrez l'ID du patient à modifier : ");
            int id = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Nouveau nom : ");
            String nom = sc.nextLine();

            System.out.print("Nouveau prénom : ");
            String prenom = sc.nextLine();

            System.out.print("Nouveau sexe (M/F) : ");
            String sexe = sc.nextLine();

            System.out.print("Nouvel age : ");
            int age = sc.nextInt();
            sc.nextLine();

            String sql = "UPDATE patient SET nom=?, prenom=?, sexe=?, age=? WHERE idP=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nom);
            ps.setString(2, prenom);
            ps.setString(3, sexe);
            ps.setInt(4, age);
            ps.setInt(5, id);

            int resultat = ps.executeUpdate();
            if (resultat > 0) {
                System.out.println("✅ Patient modifié avec succès !");
            } else {
                System.out.println("⚠️ Aucun patient trouvé avec l'ID : " + id);
            }

        } catch (SQLException e) {
            System.out.println("❌ Erreur modification : " + e.getMessage());
        }
    }

    // ========================
    // 4️⃣ SUPPRIMER UN PATIENT
    // ========================
    public void supprimerPatient() {
        try {
            System.out.print("\nEntrez l'ID du patient à supprimer : ");
            int id = sc.nextInt();
            sc.nextLine();

            String sql = "DELETE FROM patient WHERE idP=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int resultat = ps.executeUpdate();
            if (resultat > 0) {
                System.out.println("✅ Patient supprimé avec succès !");
            } else {
                System.out.println("⚠️ Aucun patient trouvé avec l'ID : " + id);
            }

        } catch (SQLException e) {
            System.out.println("❌ Erreur suppression : " + e.getMessage());
        }
    }
}






























































































































































