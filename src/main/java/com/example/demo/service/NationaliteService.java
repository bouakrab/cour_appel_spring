package com.example.demo.service;

import com.example.demo.entities.Nationalite;
import com.example.demo.entities.SourcePlaints;
import com.example.demo.repository.NationaliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationaliteService
{
    @Autowired
    private NationaliteRepository nationalitesRepository;

    // GET methods
    // Get a list of Nationality
    public List<Nationalite> getNationality() {
        return nationalitesRepository.findAll();
    }

    // Get Natiolity by ID
    public Nationalite getNationalityById(int id) {
        return nationalitesRepository.findById(id).orElse(null);
    }

    //Get By Nom
    public Nationalite getNationalityByNom(String nom) {
        return nationalitesRepository.findByNom(nom);
    }
    //POST methods
    //Save Nationality
    public Nationalite saveNationality(Nationalite nationalite) {
        return nationalitesRepository.save(nationalite); }


    // Save a list of Nationality
    public List<Nationalite> saveNationality(List<Nationalite> nationalites) {
        return nationalitesRepository.saveAll(nationalites);
    }


    // Delete method
    public String deleteNationality(int id) {
        nationalitesRepository.deleteById(id);
        return " nationality " + id + " removed ! ";
    }

    // Update method
    public Nationalite updateNationality( Nationalite nationalite) {
        Nationalite existingNationality = nationalitesRepository.findById(nationalite.getId()).orElse(null);
        existingNationality.setNom(existingNationality.getNom());
        return nationalitesRepository.save(existingNationality);
    }
}
