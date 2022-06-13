package com.example.demo.service;
import com.example.demo.entities.SourcePlaints;
import com.example.demo.repository.SourcePlaintsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SourcePlaintsService {
    @Autowired
    private SourcePlaintsRepository sourcePlaintsRepository;

    // GET methods
    // Get a list of sources' plaints
    public List<SourcePlaints> getSourcePlaints() {
        return sourcePlaintsRepository.findAll();
    }

    // Get source's plaint by ID
    public SourcePlaints getSourcePlaintsById(int id) {
        return sourcePlaintsRepository.findById(id).orElse(null);
    }

    // Get source's plaint by Name
    public SourcePlaints getSourcePlaintsByNom(String nom) {
        return sourcePlaintsRepository.findByNom(nom);
    }


    //POST methods
    //Save source plaint
    public SourcePlaints saveSourcePlaints(SourcePlaints sourcePlaints) {
        return sourcePlaintsRepository.save(sourcePlaints);
    }


    // Save a list of SourcePlaints
    public List<SourcePlaints> saveSourcesPlaints(List<SourcePlaints> sourcePlaints) {
        return sourcePlaintsRepository.saveAll(sourcePlaints);
    }


    // Delete method
    public String deleteSourcePlaints(int id) {
        sourcePlaintsRepository.deleteById(id);
        return " Source plaint " + id + " removed ! ";
    }

    // Update method
    public SourcePlaints updateSourcePlaints(SourcePlaints sourcePlaints) {
        SourcePlaints existingSourcePlaints = sourcePlaintsRepository.findById(sourcePlaints.getId()).orElse(null);
        existingSourcePlaints.setNom(sourcePlaints.getNom());
        return sourcePlaintsRepository.save(existingSourcePlaints);
    }
}
