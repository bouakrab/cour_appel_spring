package com.example.demo.controller;

import com.example.demo.entities.SituationFamill;
import com.example.demo.entities.TypeCarteIdents;
import com.example.demo.service.TypeCarteIdentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin

public class TypeCarteIdentController {

    @Autowired
    private TypeCarteIdentService typeCarteIdentService;

    //Get all TypeCarteId
    @GetMapping("/TypeCarteIdent")
    public List<TypeCarteIdents> findAllTypeCarteIdent() {
        return typeCarteIdentService.getTypeCarteIdent();
    }

    @GetMapping("/TypeCarteById/{id}")
    public TypeCarteIdents findTypeCarteIdentById(@PathVariable int id) {
        return typeCarteIdentService.getTypeCarteIdentById(id);
    }

    //get By Nom
    @GetMapping("/TypeCarteId/{nom}")
    public TypeCarteIdents findTypeCarteIdByNom(@PathVariable String nom) {
        return typeCarteIdentService.getTypeeCarteIdentByNom(nom);
    }
    // POST
    // Post one object
    @PostMapping("/addTypeCarteIdent")
    public TypeCarteIdents addTypeCarteIdent(@RequestBody TypeCarteIdents typeCarteIdents) {
        return typeCarteIdentService.saveTypeCarteIdent(typeCarteIdents);
    }

    // Post a list of typeCarteID
    @PostMapping("/addTypeCarteIdents")
    public List<TypeCarteIdents> addTypeCarteIdent(@RequestBody List<TypeCarteIdents> typeCarteIdents) {
        return typeCarteIdentService.saveTypeCartIdent(typeCarteIdents);
    }


    // Update
    @PutMapping("/updateTypeCarteIdent")
    public TypeCarteIdents updateTypeCarteIdent(@RequestBody TypeCarteIdents typeCarteIdents) {
        return typeCarteIdentService.updateTypeCarteIdent(typeCarteIdents);
    }

    // Delete
    @DeleteMapping("/deleteTypeCarteIdent/{id}")
    public String deleteTypeCarteIdent(@PathVariable int id) {
        return typeCarteIdentService.deleteTypeCarte(id);
    }

}
