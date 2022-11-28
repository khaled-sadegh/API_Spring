package com.example.fichier.model;

public class Fichier {
    private int id;
    private String nomFichier;

    public Fichier(String nomFichier){
        IdGenerator idGenerator = IdGenerator.getIdGenerator();
        this.id = idGenerator.getId();
        this.nomFichier = nomFichier;
    }

    public int getId() {
        return id;
    }

    public String getNomFichier() {
        return nomFichier;
    }
    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

}
