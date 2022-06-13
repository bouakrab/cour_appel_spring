package com.example.demo.service;

import com.example.demo.entities.TypePlaints;
import com.example.demo.repository.TypePlaintsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypePlaintsService {

    @Autowired
    private TypePlaintsRepository typePlaintsRepository;

    // GET methods
    // Get a list of types' plaints
    public List<TypePlaints> getTypePlaints() {
        return typePlaintsRepository.findAll();
    }

    // Get type's plaint by ID
    public TypePlaints getTypePlaintsById(int id) {
        return typePlaintsRepository.findById(id).orElse(null);
    }

    // Get type's plaint by Name
    public TypePlaints getTypePlaintsByNom(String nom) {
        return typePlaintsRepository.findByNom(nom);
    }


    //POST methods
    //Save type plaint
    public TypePlaints saveTypePlaints(TypePlaints typePlaints) {
       return typePlaintsRepository.save(typePlaints);
    }


    // Save a list of TypePlaints
    public List<TypePlaints> saveTypesPlaints(List<TypePlaints> typePlaints) {
        return typePlaintsRepository.saveAll(typePlaints);
    }


    // Delete method
    public String deleteTypePlaints(int id) {
        typePlaintsRepository.deleteById(id);
        return " Type plaint " + id + " removed ! ";
    }

    // Update method
    public TypePlaints updateTypePlaints(TypePlaints typePlaints) {
        TypePlaints existingTypePlaints = typePlaintsRepository.findById(typePlaints.getId()).orElse(null);
        existingTypePlaints.setNom(typePlaints.getNom());
        return typePlaintsRepository.save(existingTypePlaints);
    }
}
