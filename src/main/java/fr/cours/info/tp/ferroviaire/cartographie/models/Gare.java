package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Gare {
    private String id;
    private String nom;
    private int nombreQuais;
    private int numero;

    // Constructeur
    public Gare(String id, String nom, int nombreQuais, int numero) {
        this.id = id;
        this.nom = nom;
        this.nombreQuais = nombreQuais;
        this.numero = numero;
    }

    // Getters et setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getNombreQuais() { return nombreQuais; }
    public void setNombreQuais(int nombreQuais) { this.nombreQuais = nombreQuais; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }
}