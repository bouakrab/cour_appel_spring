package com.example.demo.service;

import com.example.demo.entities.Pays;
import com.example.demo.entities.PersonneMorale;
import com.example.demo.entities.PersonneMorale;
import com.example.demo.repository.PersonneMoraleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PersonneMoraleService {

    @Autowired
    private PersonneMoraleRepository personneMoraleRepository;

    // GET methods
    // Get a list of PersonneMorale
    public List<PersonneMorale> getPersonneMorale() {
        return personneMoraleRepository.findAll();
    }

    // Get PersonnMorale by ID
    public PersonneMorale getPersonneMoraleById(int id) {
        return personneMoraleRepository.findById(id).orElse(null);
    }

    //Get By Nom
    public PersonneMorale getPersonneMoraleByNom(String nom) {
        return personneMoraleRepository.findByNom(nom);
    }

    //POST methods
    //Save plaint
    public PersonneMorale savePersonneMorale(PersonneMorale personneMorale) {
        return personneMoraleRepository.save(personneMorale);
    }


    // Save a list of Plaints
    public List<PersonneMorale> savePersonneMorale(List<PersonneMorale> personneMorale) {
        return personneMoraleRepository.saveAll(personneMorale);
    }


    // Delete method
    public String deletePersonneMorale(int id) {
        personneMoraleRepository.deleteById(id);
        return " Personne " + id + " removed ! ";
    }

    // Update method
    public PersonneMorale updatePersonneMorale(PersonneMorale personneMorale) {
        PersonneMorale existingPersonneMorale = personneMoraleRepository.findById(personneMorale.getId()).orElse(null);
        return personneMoraleRepository.save(existingPersonneMorale);
    }
}
