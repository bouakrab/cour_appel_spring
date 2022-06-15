package com.example.demo.controller;

import com.example.demo.entities.PersonneMorale;
import com.example.demo.entities.Province;
import com.example.demo.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProvinceController {
    @Autowired
    private ProvincesService provincesService;

    //Get all Provinces
    @GetMapping("/province")
    public List<Province> findAllProvince() {
        return provincesService.getPovince();
    }

    @GetMapping("/provinceById/{id}")
    public Province findProvinceById(@PathVariable int id) {
        return provincesService.getProvinceById(id);
    }

    //get By Nom
    @GetMapping("/Province/{nom}")
    public Province findProvinceByNom(@PathVariable String nom) {
        return provincesService.getProvinceByNom(nom);
    }

    // POST
    // Post one object
    @PostMapping("/addProvince")
    public Province addProvince(@RequestBody Province province) {
        return provincesService.saveProvince(province);
    }

    // Post a list of province
    @PostMapping("/addProvinces")
    public List<Province> addProvince(@RequestBody List<Province> province) {
        return provincesService.saveProvince(province);
    }


    // Update
    @PutMapping("/updateprovince")
    public Province updateProvince(@RequestBody Province province) {
        return provincesService.updateProvince(province);
    }

    // Delete
    @DeleteMapping("/deleteProvince/{id}")
    public String deleteProvince(@PathVariable int id) {
        return provincesService.deleteProvince(id);
}
    }
