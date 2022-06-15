package com.example.demo.controller;

import com.example.demo.entities.Province;
import com.example.demo.entities.SituationFamill;
import com.example.demo.service.SituationFamillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SituationFamillController {
    @Autowired
    private SituationFamillService situationFamillService;

    //Get all SituationFamilly
    @GetMapping("/situationFamilly")
    public List<SituationFamill> findAllSituationFamily() {
        return situationFamillService.getSituationFamill();
    }

    @GetMapping("/situationFamillyById/{id}")
    public SituationFamill findSituationFamillyById(@PathVariable int id) {
        return situationFamillService.getSituationFamilyById(id);
    }


    // POST
    // Post one object
    @PostMapping("/addSituationFamilly")
    public SituationFamill addSituationFamilly(@RequestBody SituationFamill situationFamill) {
        return situationFamillService.saveSituationFamilly(situationFamill);
    }

    // Post a list of plaints
    @PostMapping("/addSuationFamillies")
    public List<SituationFamill> addSituationFamilly(@RequestBody List<SituationFamill> situationFamills) {
        return situationFamillService.saveSituationFamilly(situationFamills);
    }

    //get By Nom
    @GetMapping("/SituationFamill/{nom}")
    public SituationFamill findSituationFamillByNom(@PathVariable String nom) {
        return situationFamillService.getSituationFamillByNom(nom);
    }

    // Update
    @PutMapping("/updateSituationFamily")
    public SituationFamill updateSituationFamilly(@RequestBody SituationFamill situationFamill) {
        return situationFamillService.updateSituationFamilly(situationFamill);
    }

    // Delete
    @DeleteMapping("/deleteSituationFamillly/{id}")
    public String deletePlaint(@PathVariable int id) {
        return situationFamillService.deleteSituationFamilly(id);
    }

}
