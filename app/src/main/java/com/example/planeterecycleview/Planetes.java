package com.example.planeterecycleview;
public class Planetes {
    private String nom;
    private String description;
    private String taille;
    private String vitesse;
    private int image;

    Planetes(String nom, String description, String taille, String vitesse, int image) {
        this.nom = nom;
        this.description = description;
        this.taille = taille;
        this.vitesse = vitesse;
        this.image = image;

    }

    public String getNom() {
        return nom;
    }
    public String getDescription() {
        return description;
    }

    public String getTaille() {
        return taille;
    }
    public String getVitesse() {
        return vitesse;
    }

    public int  getImage() {
        return image;
    }
}
