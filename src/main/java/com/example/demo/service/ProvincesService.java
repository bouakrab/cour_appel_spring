package com.example.demo.service;

import com.example.demo.entities.PersonneMorale;
import com.example.demo.entities.Province;
import com.example.demo.repository.ProvincesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvincesService {
    @Autowired
    private ProvincesRepository provincesRepository;

    // GET methods
    // Get a list of province
    public List<Province> getPovince() {
        return provincesRepository.findAll();
    }

    // Get province by ID
    public Province getProvinceById(int id) {
        return provincesRepository.findById(id).orElse(null);
    }

    //Get By Nom
    public Province getProvinceByNom(String nom) {
        return provincesRepository.findByNom(nom);
    }
    //POST methods
    //Save province
    public Province saveProvince(Province province) {
        return provincesRepository.save(province);
    }


    // Save a list of Plaints
    public List<Province> saveProvince(List<Province> provinces) {
        return provincesRepository.saveAll(provinces);
    }


    // Delete method
    public String deleteProvince(int id) {
        provincesRepository.deleteById(id);
        return " Province " + id + " removed ! ";
    }

    // Update method
    public Province updateProvince(Province province) {
        Province existingProvince = provincesRepository.findById(province.getId()).orElse(null);
        existingProvince.setNom(province.getNom());

        return provincesRepository.save(existingProvince);
    }
}
