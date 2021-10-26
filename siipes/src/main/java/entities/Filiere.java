package entities;

public class Filiere {

    private long idFiliere;
    private String nomFiliere;
    private String descriptionFiliere;
    private String langue;


    public Filiere(long idFiliere, String nomFiliere, String descriptionFiliere, String langue) {
        this.idFiliere = idFiliere;
        this.nomFiliere = nomFiliere;
        this.descriptionFiliere = descriptionFiliere;
        this.langue = langue;
    }

    public Filiere(String nomFiliere, String descriptionFiliere, String langue) {
        this.nomFiliere = nomFiliere;
        this.descriptionFiliere = descriptionFiliere;
        this.langue = langue;
    }

    public Filiere() {
    }

    public long getIdFiliere() {
        return idFiliere;
    }

    public String getNomFiliere() {
        return nomFiliere;
    }

    public String getDescriptionFiliere() {
        return descriptionFiliere;
    }

    public String getLangue() {
        return langue;
    }

    public void setIdFiliere(long idFiliere) {
        this.idFiliere = idFiliere;
    }

    public void setNomFiliere(String nomFiliere) {
        this.nomFiliere = nomFiliere;
    }

    public void setDescriptionFiliere(String descriptionFiliere) {
        this.descriptionFiliere = descriptionFiliere;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "Filiere{" +
                "idFiliere=" + idFiliere +
                ", nomFiliere='" + nomFiliere + '\'' +
                ", descriptionFiliere='" + descriptionFiliere + '\'' +
                ", langue='" + langue + '\'' +
                '}';
    }
}
