package fr.diginamic.recensement.entites;

public class Departement {
    private int ID_departement;
    String nom_departement;

    public Departement() {
        this.ID_departement = ID_departement;
        this.nom_departement = nom_departement;
    }

    public int getID_departement() {
        return ID_departement;
    }

    public void setID_departement(int ID_departement) {
        this.ID_departement = ID_departement;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "ID_departement=" + ID_departement +
                ", nom_departement='" + nom_departement + '\'' +
                '}';
    }
}
