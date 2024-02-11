package tn.esprit.Models;

public class Personne {
    private int id, numero;
    private String nom, prenom, ville, email;

    public Personne(){}

    public Personne(int id, int numero, String nom, String prenom, String ville, String email) {
        this.id = id;
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    public String getEmail() {
        return email;
    }



    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", numero=" + numero +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ville='" + ville + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
