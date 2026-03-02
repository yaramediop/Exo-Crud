package MODELE;

public class Consultation {
package MODELE;

    
    private int id;
    private String objet;
    private double montant;
    private int idPatient;
    private int idMedecin;

   
    public Consultation() {
    }

    
    public Consultation(int id, String objet, double montant, int idPatient, int idMedecin) {
        this.id = id;
        this.objet = objet;
        this.montant = montant;
        this.idPatient = idPatient;
        this.idMedecin = idMedecin;
    }

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getObjet() { return objet; }
    public void setObjet(String objet) { this.objet = objet; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public int getIdPatient() { return idPatient; }
    public void setIdPatient(int idPatient) { this.idPatient = idPatient; }

    public int getIdMedecin() { return idMedecin; }
    public void setIdMedecin(int idMedecin) { this.idMedecin = idMedecin; }
}


