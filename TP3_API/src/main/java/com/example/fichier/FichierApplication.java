package com.example.fichier;

import com.example.fichier.dao.FichierDAO;
import com.example.fichier.model.Fichier;
import com.example.fichier.web.controller.FichierController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FichierApplication {

    public static void main(String[] args) {

        SpringApplication.run(FichierApplication.class, args);
    }

}
