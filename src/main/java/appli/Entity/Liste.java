package appli.Entity;

public class Liste {

    public Liste(int id_liste, String nom) {
        this.id_liste = id_liste;
        this.nom = nom;
    }

    private int id_liste;
    private String nom;


    public int getId_liste() {
        return id_liste;
    }

    public void setId_liste(int id_liste) {
        this.id_liste = id_liste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
