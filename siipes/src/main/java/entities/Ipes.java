package entities;

public class Ipes {

    private long idIpes;
    private long idVille;
    private String nomIpes;
    private String anneeOuverture;
    private String refAutorisation;
    private String localisation;
    private String contact;
    private String promoteur;


    public Ipes(long idIpes, long idVille, String nomIpes, String anneeOuverture, String refAutorisation, String localisation, String contact, String promoteur) {
        this.idIpes = idIpes;
        this.idVille = idVille;
        this.nomIpes = nomIpes;
        this.anneeOuverture = anneeOuverture;
        this.refAutorisation = refAutorisation;
        this.localisation = localisation;
        this.contact = contact;
        this.promoteur = promoteur;
    }

    public Ipes(long idVille, String nomIpes, String anneeOuverture, String refAutorisation, String localisation, String contact, String promoteur) {
        this.idVille = idVille;
        this.nomIpes = nomIpes;
        this.anneeOuverture = anneeOuverture;
        this.refAutorisation = refAutorisation;
        this.localisation = localisation;
        this.contact = contact;
        this.promoteur = promoteur;
    }

    public Ipes() {
    }

    public void setIdIpes(long idIpes) {
        this.idIpes = idIpes;
    }

    public void setIdVille(long idVille) {
        this.idVille = idVille;
    }

    public void setNomIpes(String nomIpes) {
        this.nomIpes = nomIpes;
    }

    public void setAnneeOuverture(String anneeOuverture) {
        this.anneeOuverture = anneeOuverture;
    }

    public void setRefAutorisation(String refAutorisation) {
        this.refAutorisation = refAutorisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPromoteur(String promoteur) {
        this.promoteur = promoteur;
    }

    public long getIdIpes() {
        return idIpes;
    }

    public long getIdVille() {
        return idVille;
    }

    public String getNomIpes() {
        return nomIpes;
    }

    public String getAnneeOuverture() {
        return anneeOuverture;
    }

    public String getRefAutorisation() {
        return refAutorisation;
    }

    public String getLocalisation() {
        return localisation;
    }

    public String getContact() {
        return contact;
    }

    public String getPromoteur() {
        return promoteur;
    }
}
