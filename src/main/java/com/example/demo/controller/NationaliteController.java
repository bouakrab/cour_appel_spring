package com.example.demo.controller;

import com.example.demo.entities.Nationalite;
import com.example.demo.entities.SourcePlaints;
import com.example.demo.service.NationaliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class NationaliteController {
    @Autowired
    private NationaliteService nationaliteService;

    //Get all Nationality
    @GetMapping("/nationality")
    public List<Nationalite> findAllNationality() {
        return nationaliteService.getNationality();
    }

    @GetMapping("/nationalityById/{id}")
    public Nationalite findNationalityById(@PathVariable int id) {
        return nationaliteService.getNationalityById(id);
    }

    @GetMapping("/Nationalite/{nom}")
    public Nationalite findNationaliteByNom(@PathVariable String nom) {
        return nationaliteService.getNationalityByNom(nom);
    }
    // POST
    // Post one object
    @PostMapping("/addNationality")
    public Nationalite addNationality(@RequestBody Nationalite nationalite) {
        return nationaliteService.saveNationality(nationalite);
    }

    // Post a list of Nationality
    @PostMapping("/addnationalities")
    public List<Nationalite> addNationality(@RequestBody List<Nationalite> nationalite) {
        return nationaliteService.saveNationality(nationalite);
    }


    // Update nationality
    @PutMapping("/updateNationslity")
    public Nationalite updateNationality(@RequestBody Nationalite nationalite) {
        return nationaliteService.updateNationality(nationalite);
    }

    // Delete nationality
    @DeleteMapping("/deleteNatoinality/{id}")
    public String deleteNationality(@PathVariable int id) {
        return nationaliteService.deleteNationality(id);
    }
}
