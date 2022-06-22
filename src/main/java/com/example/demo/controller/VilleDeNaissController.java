package com.example.demo.controller;

import com.example.demo.entities.TypePlaints;
import com.example.demo.entities.VilleDeNaiss;
import com.example.demo.service.VilleDenaisseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin

public class VilleDeNaissController {

    @Autowired
    private VilleDenaisseService villeDenaisseService;

    //Get all Ville de naissance
    @GetMapping("/villeDeNaiss")
    public List<VilleDeNaiss> findAllVilleDeNaiss() {
        return villeDenaisseService.getVileeDeNaiss();
    }

    @GetMapping("/villeDeNaissById/{id}")
    public VilleDeNaiss findPlaintById(@PathVariable int id) {
        return villeDenaisseService.getVilleDeNaissById(id);
    }

    @GetMapping("/VilleDeNaiss/{nom}")
    public VilleDeNaiss findVillDeNaissByNom(@PathVariable String nom) {
        return villeDenaisseService.getVilleDenaissByNom(nom);
    }

    // POST
    // Post one object
    @PostMapping("/addVilleDeNaiss")
    public VilleDeNaiss addVilleDeNaiss(@RequestBody VilleDeNaiss villeDeNaiss) {
        return villeDenaisseService.saveVilleDeNaiss(villeDeNaiss);
    }

    // Post a list of villle de naissance
    @PostMapping("/addlisteVilleDeNaiss")
    public List<VilleDeNaiss> addVilleDeNaiss(@RequestBody List<VilleDeNaiss> villeDeNaisses) {
        return villeDenaisseService.saveVilleDeNaiss(villeDeNaisses);
    }


    // Update
    @PutMapping("/updateVilleDeNaiss")
    public VilleDeNaiss updateVilleDeNaissance(@RequestBody VilleDeNaiss villeDeNaiss) {
        return villeDenaisseService.updateVilleDeNaiss(villeDeNaiss);
    }

    // Delete
    @DeleteMapping("/deleteVilleDeNaiss/{id}")
    public String deleteVilleDeNaiss(@PathVariable int id) {
        return villeDenaisseService.deleteVilleDeNaiss(id);
    }
}
