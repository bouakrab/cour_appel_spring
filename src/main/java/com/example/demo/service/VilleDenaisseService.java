package com.example.demo.service;

import com.example.demo.entities.SourcePlaints;
import com.example.demo.entities.VilleDeNaiss;
import com.example.demo.repository.VilleDeNaissRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VilleDenaisseService {
    @Autowired
    private VilleDeNaissRepository villeDeNaissRepository;

    // GET methods
    // Get a list of Ville de naissance
    public List<VilleDeNaiss> getVileeDeNaiss() {
        return villeDeNaissRepository.findAll();
    }

    // Get Ville De Naissance by ID
    public VilleDeNaiss getVilleDeNaissById(int id) {
        return villeDeNaissRepository.findById(id).orElse(null);
    }

    // Get source's plaint by Name
    public VilleDeNaiss getVilleDenaissByNom(String nom) {
        return villeDeNaissRepository.findByNom(nom);
    }

    //POST methods
    //Save Ville de naissance
    public VilleDeNaiss saveVilleDeNaiss(VilleDeNaiss villeDeNaiss) {
        return villeDeNaissRepository.save(villeDeNaiss);
    }


    // Save a list of Ville De Naissance
    public List<VilleDeNaiss> saveVilleDeNaiss(List<VilleDeNaiss> villeDeNaisses) {
        return villeDeNaissRepository.saveAll(villeDeNaisses);
    }


    // Delete ville de naissance
    public String deleteVilleDeNaiss(int id) {
        villeDeNaissRepository.deleteById(id);
        return " ville de naisssance " + id + " removed ! ";
    }

    // Update method
    public VilleDeNaiss updateVilleDeNaiss(VilleDeNaiss villeDeNaiss) {
        VilleDeNaiss existingVilleDeNaiss = villeDeNaissRepository.findById(villeDeNaiss.getId()).orElse(null);
        existingVilleDeNaiss.setNom(villeDeNaiss.getNom());
        return villeDeNaissRepository.save(existingVilleDeNaiss);
    }
}
