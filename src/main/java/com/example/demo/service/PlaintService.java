package com.example.demo.service;
import com.example.demo.entities.Plaint;
import com.example.demo.repository.PlaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class PlaintService {
    @Autowired
    private PlaintRepository PlaintRepository;

    // GET methods
    // Get a list of plaints
    public List<Plaint> getPlaint() {
        return PlaintRepository.findAll();
    }

    // Get plaint by ID
    public Plaint getPlaintById(int id) {
        return PlaintRepository.findById(id).orElse(null);
    }


    //POST methods
    //Save plaint
    public Plaint savePlaint(Plaint plaint) {
        return PlaintRepository.save(plaint);
    }


    // Save a list of Plaints
    public List<Plaint> savePlaint(List<Plaint> plaint) {
        return PlaintRepository.saveAll(plaint);
    }


    // Delete method
    public String deletePlaint(int id) {
        PlaintRepository.deleteById(id);
        return " Plaint " + id + " removed ! ";
    }

    // Update method
    public Plaint updatePlaint(Plaint plaint) {
        Plaint existingPlaint = PlaintRepository.findById(plaint.getId()).orElse(null);
        existingPlaint.setContreInconnu(plaint.getContreInconnu());
        existingPlaint.setReferencePlaints(plaint.getReferencePlaints());
        existingPlaint.setDatePlaints(plaint.getDatePlaints());
        existingPlaint.setDateEnregPlaints(plaint.getDateEnregPlaints());
        existingPlaint.setDateFaits(plaint.getDateFaits());
        existingPlaint.setEmplaceFaits(plaint.getEmplaceFaits());
        existingPlaint.setSujetPlaints(plaint.getSujetPlaints());
        return PlaintRepository.save(existingPlaint);
    }
}