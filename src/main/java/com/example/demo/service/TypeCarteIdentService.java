package com.example.demo.service;

import com.example.demo.entities.SourcePlaints;
import com.example.demo.entities.TypeCarteIdents;
import com.example.demo.repository.TypeCarteIdentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeCarteIdentService {

    @Autowired
    private TypeCarteIdentRepository typeCarteIdentRepository;

    // GET methods
    // Get a list of TypeCarteId
    public List<TypeCarteIdents> getTypeCarteIdent() {
        return typeCarteIdentRepository.findAll();
    }

    // Get TypeCateID by ID
    public TypeCarteIdents getTypeCarteIdentById(int id) {
        return typeCarteIdentRepository.findById(id).orElse(null);
    }

    // Get source's plaint by Name
    public TypeCarteIdents getTypeeCarteIdentByNom(String nom) {
        return typeCarteIdentRepository.findByNom(nom);
    }

    //POST methods
    //Save TypeCarteID
    public TypeCarteIdents saveTypeCarteIdent(TypeCarteIdents typeCarteIdents) {
        return typeCarteIdentRepository.save(typeCarteIdents);
    }


    // Save a list of TypeCarteId
    public List<TypeCarteIdents> saveTypeCartIdent(List<TypeCarteIdents> typeCarteIdents) {
        return typeCarteIdentRepository.saveAll(typeCarteIdents);
    }


    // Delete TypeCarteIdent
    public String deleteTypeCarte(int id) {
        typeCarteIdentRepository.deleteById(id);
        return " TypeCarteId " + id + " removed ! ";
    }

    // Update method
    public TypeCarteIdents updateTypeCarteIdent(TypeCarteIdents typeCarteIdents) {
        TypeCarteIdents existingTypeCarteIdent = typeCarteIdentRepository.findById(typeCarteIdents.getId()).orElse(null);
        existingTypeCarteIdent.setNom(typeCarteIdents.getNom());
        return typeCarteIdentRepository.save(existingTypeCarteIdent);
    }
}
