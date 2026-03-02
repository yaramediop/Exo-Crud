package MODELE;

public class Patien {
private int idP;
private String nom;
private String prenom;
private String sexe;
private int age;

public patient (){}
public patient (String nom, String prenom, String sexe, int age){
    this.nom= nom;
    this.prenom= prenom;
    this.sexe= sexe;
    this.age= age;
}
   // Getters
    public int getIdP() {
        return idP;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getSexe() {
        return sexe;
    }
    public int getAge() {
        return age;
    }

    // Setters
    public void setIdP(int idP) {
        this.idP = idP;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
