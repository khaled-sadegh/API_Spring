package com.example.fichier.dao;

import com.example.fichier.model.Fichier;

import java.util.List;

public interface IFichierDAO {

    List<Fichier> findAll();

    Fichier findById(int id);

    void saveFichier(Fichier fichier);

    void remove(int id);
}
