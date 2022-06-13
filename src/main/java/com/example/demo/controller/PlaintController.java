package com.example.demo.controller;

import com.example.demo.entities.Plaint;
import com.example.demo.service.PlaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaintController {
    @Autowired
    private PlaintService plaintService;

    //Get all plaints
    @GetMapping("/plaint")
    public List<Plaint> findAllPlaint() {
        return plaintService.getPlaint();
    }

    @GetMapping("/plaintById/{id}")
    public Plaint findPlaintById(@PathVariable int id) {
        return plaintService.getPlaintById(id);
    }


    // POST
    // Post one object
    @PostMapping("/addPlaint")
    public Plaint addPlaint(@RequestBody Plaint plaint) {
        return plaintService.savePlaint(plaint);
    }

    // Post a list of plaints
    @PostMapping("/addPlaints")
    public List<Plaint> addPlaints(@RequestBody List<Plaint> plaint) {
        return plaintService.savePlaint(plaint);
    }


    // Update
    @PutMapping("/updatePlaint")
    public Plaint updatePlaint(@RequestBody Plaint plaint) {
        return plaintService.updatePlaint(plaint);
    }

    // Delete
    @DeleteMapping("/deletePlaint/{id}")
    public String deletePlaint(@PathVariable int id) {
        return plaintService.deletePlaint(id);
    }

}
