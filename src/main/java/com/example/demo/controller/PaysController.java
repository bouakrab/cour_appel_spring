package com.example.demo.controller;
import com.example.demo.entities.Nationalite;
import com.example.demo.entities.Pays;
import com.example.demo.service.PaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PaysController {
    @Autowired
    private PaysService paysService;

    //Get all Pays
    @GetMapping("/pays")
    public List<Pays> findAllPays() {
        return paysService.getPays();
    }

    @GetMapping("/PayById/{id}")
    public Pays findPaysById(@PathVariable int id) {
        return paysService.getPaysById(id);
    }

     //get By Nom
     @GetMapping("/Pay/{nom}")
     public Pays finPaysByNom(@PathVariable String nom) {
         return paysService.getPaysByNom(nom);
     }
    // POST
    // Post one object
   @PostMapping("/addPay")
    public Pays addPays(@RequestBody Pays pays) {
        return paysService.savePays(pays);
    }

    // Post a list of plaints
    /*@PostMapping("/addPays")
    public List<Pays> addPays(@RequestBody List<Pays> pays) {
        return paysService.savePays(pays);
    }
*/

    // Update
    @PutMapping("/updatePays")
    public Pays updatePays(@RequestBody Pays pays) {
        return paysService.updatePays(pays);
    }

    // Delete
    @DeleteMapping("/deletePays/{id}")
    public String deletePays(@PathVariable int id) {
        return paysService.deletePays(id);
    }
}
