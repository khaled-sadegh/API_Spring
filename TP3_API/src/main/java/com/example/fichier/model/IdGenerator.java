package com.example.fichier.model;

public class IdGenerator {

    // attribut privé qui fait référence à l'objet
    private static IdGenerator idGenerator = new IdGenerator();

    private int id = 0;

    private IdGenerator(){
    }

    public static IdGenerator getIdGenerator() {
        return idGenerator;
    }

    public int getId() {
        this.id ++;
        System.out.println("New ID " + id + " created succefully !");
        return id;
    }
}
