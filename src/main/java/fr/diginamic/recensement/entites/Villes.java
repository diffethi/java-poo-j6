package fr.diginamic.recensement.entites;

public class Villes {
    private int ID_ville;
    String nom;

    public Villes() {
        this.ID_ville = ID_ville;
        this.nom = nom;
    }

    public int getID_ville() {
        return ID_ville;
    }

    public void setID_ville(int ID_ville) {
        this.ID_ville = ID_ville;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "villes{" +
                "ID_ville=" + ID_ville +
                ", nom='" + nom + '\'' +
                '}';
    }
}
