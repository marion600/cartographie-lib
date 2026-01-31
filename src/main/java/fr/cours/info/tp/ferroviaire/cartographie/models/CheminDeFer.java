package fr.cours.info.tp.ferroviaire.cartographie.models;

import java.util.ArrayList;
import java.util.List;

public class CheminDeFer {
    private String id;
    private String nom;
    private double distance;
    private Gare gareDepart;
    private Gare gareArrivee;
    private List<Voie> voies = new ArrayList<>();

    // Constructeur
    public CheminDeFer(String id, String nom, double distance, Gare gareDepart, Gare gareArrivee) {
        this.id = id;
        this.nom = nom;
        this.distance = distance;
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
    }

    // GETTERS et SETTERS
    public Gare getGareDepart() {
        return gareDepart;
    }

    public void setGareDepart(Gare gareDepart) {
        this.gareDepart = gareDepart;
    }

    public Gare getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(Gare gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    // GETTER pour voies (pas de setter direct, on utilise add/remove)
    public List<Voie> getVoies() {
        return voies;
    }

    // SETTER pour remplacer toute la liste (optionnel)
    public void setVoies(List<Voie> voies) {
        this.voies = voies;
    }

    // Méthodes pratiques pour ajouter/supprimer
    public void ajouterVoie(Voie voie) {
        this.voies.add(voie);
    }

    public void supprimerVoie(Voie voie) {
        this.voies.remove(voie);
    }


}