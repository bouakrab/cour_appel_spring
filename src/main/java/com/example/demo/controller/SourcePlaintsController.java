package com.example.demo.controller;

import com.example.demo.entities.SourcePlaints;
import com.example.demo.service.SourcePlaintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SourcePlaintsController {

    @Autowired
    private SourcePlaintsService sourcePlaintsService;

    //Get all sources of plaints
    @GetMapping("/sourceplaints")
    public List<SourcePlaints> findAllSourcePlaints() {
        return sourcePlaintsService.getSourcePlaints();
    }

    @GetMapping("/sourceplaintsById/{id}")
    public SourcePlaints findSourcePlaintsById(@PathVariable int id) {
        return sourcePlaintsService.getSourcePlaintsById(id);
    }

    @GetMapping("/sourceplaints/{nom}")
    public SourcePlaints findSourcePlaintsByNom(@PathVariable String nom) {
        return sourcePlaintsService.getSourcePlaintsByNom(nom);
    }

    // POST
    // Post one object
    @PostMapping("/addSourcePlaints")
    public SourcePlaints addSourcePlaints(@RequestBody SourcePlaints sourcePlaints) {
        return sourcePlaintsService.saveSourcePlaints(sourcePlaints);
    }

    // Post a list of sources' plaints
    @PostMapping("/addSourcesPlaints")
    public List<SourcePlaints> addSourcesPlaints(@RequestBody List<SourcePlaints> sourcePlaints) {
        return sourcePlaintsService.saveSourcesPlaints(sourcePlaints);
    }


    // Update
    @PutMapping("/updateSourcePlaints")
    public SourcePlaints updateSourcePlaints(@RequestBody SourcePlaints sourcePlaints) {
        return sourcePlaintsService.updateSourcePlaints(sourcePlaints);
    }

    // Delete
    @DeleteMapping("/deleteSourcePlaints/{id}")
    public String deleteSourcePlaints(@PathVariable int id) {
        return sourcePlaintsService.deleteSourcePlaints(id);
    }



}
