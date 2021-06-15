package fr.diginamic.recensement.entites;

public class Region {
    int ID_region;
    String nom_region;

    public Region() {

        this.ID_region = ID_region;
        this.nom_region = nom_region;
    }

    public int getID_region() {
        return ID_region;
    }

    public void setID_region(int ID_region) {
        this.ID_region = ID_region;
    }

    public String getNom_region() {
        return nom_region;
    }

    public void setNom_region(String nom_region) {
        this.nom_region = nom_region;
    }

    @Override
    public String toString() {
        return "Region{" +
                "ID_region=" + ID_region +
                ", nom_region='" + nom_region + '\'' +
                '}';
    }
}
