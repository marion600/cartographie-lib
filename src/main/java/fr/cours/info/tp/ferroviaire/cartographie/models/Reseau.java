package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.List;

public class Reseau {
    private String nom;
    private List<Gare> gares = new ArrayList<>();
    private List<CheminDeFer> chemins = new ArrayList<>();

    // Constructeur
    public Reseau(String nom) {
        this.nom = nom;
    }

    // Getters et setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public List<Gare> getGares() { return gares; }
    public List<CheminDeFer> getChemins() { return chemins; }

    // Méthodes d'ajout/suppression
    public void ajouterGare(Gare gare) {
        gares.add(gare);
    }

    public void retirerGare(Gare gare) {
        gares.remove(gare);
    }

    public void ajouterChemin(CheminDeFer chemin) {
        chemins.add(chemin);
    }

    public void retirerChemin(CheminDeFer chemin) {
        chemins.remove(chemin);
    }
}