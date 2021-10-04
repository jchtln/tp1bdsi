package modele;

import java.sql.Date;

public class Oeuvre {
    /* INSERT INTO oeuvre(nom, dateArrivee) VALUES ('T-Rex', '2015-09-15');
INSERT INTO deplacement(idOeuvre,idSalle,dateDeplacement) VALUES (1,3,'2015-09-15');
INSERT INTO deplacement(idOeuvre,idSalle,dateDeplacement) VALUES (1,2,'2016-01-01');
INSERT INTO deplacement(idOeuvre,idSalle,dateDeplacement) VALUES (1,1,'2016-09-01'); */

    private String nom;
    private Date dateArrivee;


    public Oeuvre(String nom, Date dateArrivee) {
        this.nom = nom;
        this.dateArrivee = dateArrivee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }
}
