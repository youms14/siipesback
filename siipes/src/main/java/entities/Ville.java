package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Ville implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "idVille", nullable = false)
    private long idVille;

   @Column(name = "nomRegion", nullable = true, length=50)
    private String nomRegion;

    @Column(name = "nomVille", nullable = true, length=50)
    private String nomVille;

    public Ville(long idVille, String nomRegion, String nomVille) {
        this.idVille = idVille;
        this.nomRegion = nomRegion;
        this.nomVille = nomVille;
    }

    public Ville(String nomRegion, String nomVille) {
        this.nomRegion = nomRegion;
        this.nomVille = nomVille;
    }

    public Ville() {
    }

    public long getIdVille() {
        return idVille;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setIdVille(long idVille) {
        this.idVille = idVille;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "idVille=" + idVille +
                ", nomRegion='" + nomRegion + '\'' +
                ", nomVille='" + nomVille + '\'' +
                '}';
    }
}
