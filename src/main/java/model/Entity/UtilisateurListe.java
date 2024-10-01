package model.Entity;

public class UtilisateurListe {

    private int ref_utilisateur;
    private int ref_liste;

    public UtilisateurListe(int ref_utilisateur, int ref_liste) {
        this.ref_utilisateur = ref_utilisateur;
        this.ref_liste = ref_liste;
    }

    public int getRef_utilisateur() {
        return ref_utilisateur;
    }

    public void setRef_utilisateur(int ref_utilisateur) {
        this.ref_utilisateur = ref_utilisateur;
    }

    public int getRef_liste() {
        return ref_liste;
    }

    public void setRef_liste(int ref_liste) {
        this.ref_liste = ref_liste;
    }


}
