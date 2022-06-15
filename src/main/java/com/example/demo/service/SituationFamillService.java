package com.example.demo.service;

import com.example.demo.entities.Province;
import com.example.demo.entities.SituationFamill;
import com.example.demo.repository.SituationFamillReppository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SituationFamillService {

    @Autowired
    private SituationFamillReppository situationFamillReppository;

    // GET methods
    // Get a list of SituationFamilly
    public List<SituationFamill> getSituationFamill() {
        return situationFamillReppository.findAll();
    }

    // Get SituationFamily by ID
    public SituationFamill getSituationFamilyById(int id) {
        return situationFamillReppository.findById(id).orElse(null);
    }

    //Get By Nom
    public SituationFamill getSituationFamillByNom(String nom) {
        return situationFamillReppository.findByNom(nom);
    }

    //POST methods
    //Save SituationFamily
    public SituationFamill saveSituationFamilly(SituationFamill situationFamill) {
        return situationFamillReppository.save(situationFamill);
    }


    // Save a list of Plaints
    public List<SituationFamill> saveSituationFamilly(List<SituationFamill> situationFamills) {
        return situationFamillReppository.saveAll(situationFamills);
    }


    // Delete method
    public String deleteSituationFamilly(int id) {
        situationFamillReppository.deleteById(id);
        return " SituationFamilly " + id + " removed ! ";
    }

    // Update method
    public SituationFamill updateSituationFamilly(SituationFamill situationFamill) {
        SituationFamill existingSituationFamilly = situationFamillReppository.findById(situationFamill.getId()).orElse(null);
        situationFamill.setNom(situationFamill.getNom());
        return situationFamillReppository.save(existingSituationFamilly);
    }
}
