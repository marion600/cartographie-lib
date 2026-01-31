package fr.cours.info.tp.ferroviaire.cartographie.models;

public class Voie {
    private int numero;
    private double vitesseMax;
    private boolean sensUnique;  // ← AJOUTÉ

    // Constructeur modifié
    public Voie(int numero, double vitesseMax, boolean sensUnique) {
        this.numero = numero;
        this.vitesseMax = vitesseMax;
        this.sensUnique = sensUnique;
    }

    // Getter pour sensUnique
    public boolean isSensUnique() {
        return sensUnique;
    }

    // ... autres getters/setters
}