package com.example.demo.service;

import com.example.demo.entities.Nationalite;
import com.example.demo.entities.Pays;
import com.example.demo.entities.Plaint;
import com.example.demo.repository.PaysRepository;
import com.example.demo.repository.PlaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaysService {
    @Autowired
    private PaysRepository paysRepository;

    // GET methods
    // Get a list of Pays
    public List<Pays> getPays() {
        return paysRepository.findAll();
    }

    // Get Pays by ID
    public Pays getPaysById(int id) {
        return paysRepository.findById(id).orElse(null);
    }

    //Get By nom
    //Get By Nom
    public Pays getPaysByNom(String nom) {
        return paysRepository.findByNom(nom);
    }


    //POST methods
    //Save pays
    public Pays savePays(Pays pays) {
        return paysRepository.save(pays);
    }


    // Save a list of pays
    public List<Pays> savePays(List<Pays> pays) {
        return paysRepository.saveAll(pays);
    }


    // Delete method
    public String deletePays(int id) {
        paysRepository.deleteById(id);
        return " Pays " + id + " removed ! ";
    }

    // Update method
    public Pays updatePays(Pays pays) {
        Pays existingPays = paysRepository.findById(pays.getId()).orElse(null);
        existingPays.setNom(existingPays.getNom());
        return paysRepository.save(existingPays);
    }
}
