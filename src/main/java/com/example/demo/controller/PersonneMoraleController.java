package com.example.demo.controller;

import com.example.demo.entities.Pays;
import com.example.demo.entities.PersonneMorale;
import com.example.demo.service.PersonneMoraleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin

public class PersonneMoraleController {

    @Autowired
    private PersonneMoraleService personneMoraleService;

    //Get all Personne Morale
    @GetMapping("/personneMorale")
    public List<PersonneMorale> findAllPersonneMorale() {
        return personneMoraleService.getPersonneMorale();
    }
    //get personneMoraleById

    @GetMapping("/personneMoraleById/{id}")
    public PersonneMorale findPersonneMoraleById(@PathVariable int id) {
        return personneMoraleService.getPersonneMoraleById(id);
    }

    //get personne morale by Nom
    @GetMapping("/PersonneMorale/{nom}")
    public PersonneMorale findPaysByNom(@PathVariable String nom) {
        return personneMoraleService.getPersonneMoraleByNom(nom);
    }


    // POST
    // Post one object
    @PostMapping("/addpersonneMorale")
    public PersonneMorale addPersonneMorale(@RequestBody PersonneMorale personneMorale) {
        return personneMoraleService.savePersonneMorale(personneMorale);
    }

    // Post a list of personneMorale
    @PostMapping("/addpersonneMorales")
    public List<PersonneMorale> addPersonneMorale(@RequestBody List<PersonneMorale> personneMorale) {
        return personneMoraleService.savePersonneMorale(personneMorale);
    }


    // Update PersonneMorale
    @PutMapping("/updatePersonneMorale")
    public PersonneMorale updatePersonneMorale(@RequestBody PersonneMorale personneMorale) {
        return personneMoraleService.updatePersonneMorale(personneMorale);
    }

    // Delete
    @DeleteMapping("/deletePersonneMorale/{id}")
    public String deletePersonneMorale(@PathVariable int id) {
        return personneMoraleService.deletePersonneMorale(id);
    }

}

