package com.example.fichier.dao;

import com.example.fichier.model.Fichier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FichierDAO implements IFichierDAO{

    private List<Fichier> fichiers;

    public FichierDAO(){
        this.fichiers = new ArrayList<>();
        this.fichiers.add(new Fichier("test 1"));
        this.fichiers.add(new Fichier( "test 2"));
    }
    @Override
    public List<Fichier> findAll() {
        return this.fichiers;
    }

    @Override
    public Fichier findById(int id) {
        for(Fichier f : fichiers){
            if (f.getId() == id) return f;
        }
        return null;
    }

    @Override
    public void saveFichier(Fichier fichier) {
        this.fichiers.add(fichier);
    }

    @Override
    public void remove(int id){ this.fichiers.remove(this.findById(id)); }

}
