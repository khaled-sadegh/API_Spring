package com.example.fichier.web.controller;

import com.example.fichier.dao.IFichierDAO;
import com.example.fichier.model.Fichier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FichierController {

    @Autowired
    private IFichierDAO dao;

    public FichierController(IFichierDAO dao){
        this.dao = dao;
    }

    @GetMapping(value ="/Fichiers")
    public List<Fichier> getFichiers(){
        return dao.findAll() ;
    }

    @GetMapping(value="Fichier/{id}")
    public Fichier getFichier(@PathVariable int id){
        return dao.findById(id);
    }

    @PostMapping(value="Fichier")
    public void addFichier(@RequestBody String nomFichier){
        dao.saveFichier(new Fichier(nomFichier));
    }

    @PutMapping(value="Fichier/{id}")
    public void modifierFichier(@PathVariable int id, @RequestBody String newName){
        dao.findById(id).setNomFichier(newName);
    }

    @DeleteMapping(value="Fichier/{id}")
    public void supprimerFichier(@PathVariable int id){
        dao.remove(id);
    }
}
