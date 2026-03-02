package SERVICE;

import java.sql.ResultSet;
import java.sql.SQLException;
import Dao.Jdbc;
import MODELE.Medecin;

public class FonctionnaliteMed {

    // Ajouter un médecin (Correction de la syntaxe INSERT)
    public void ajouter(Medecin m) {
        Jdbc Jd = new Jdbc();
        Jd.connect();
        String req = "INSERT INTO Medecin(nom, prenom, specialite) VALUES('" 
                     + m.getNom() + "','" + m.getPrenom() + "','" + m.getSpecialite() + "')";
        try {
            Jd.sta.executeUpdate(req);
            System.out.println("Médecin ajouté !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Supprimer un médecin par son ID
    public void supprimer(int id) {
        Jdbc Jd = new Jdbc();
        Jd.connect();
        String req = "DELETE FROM Medecin WHERE id=" + id;
        try {
            Jd.sta.executeUpdate(req);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Modifier les informations (Correction de la syntaxe UPDATE)
    public void modifier(Medecin m) {
        Jdbc Jd = new Jdbc();
        Jd.connect();
        String req = "UPDATE Medecin SET nom='" + m.getNom() + 
                     "', prenom='" + m.getPrenom() + 
                     "', specialite='" + m.getSpecialite() + 
                     "' WHERE id=" + m.getId();
        try {
            Jd.sta.executeUpdate(req);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Récupérer la liste complète des médecins
    public ResultSet listeMedecins() {
        Jdbc Jd = new Jdbc();
        Jd.connect();
        String req = "SELECT * FROM Medecin";
        ResultSet rs = null;
        try {
            rs = Jd.sta.executeQuery(req);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs; 
    }

    // Rechercher un médecin spécifique
    public ResultSet recherche(int id) {
        Jdbc Jd = new Jdbc();
        Jd.connect();
        String req = "SELECT * FROM Medecin WHERE id=" + id;
        ResultSet rs = null;
        try {
            rs = Jd.sta.executeQuery(req);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}