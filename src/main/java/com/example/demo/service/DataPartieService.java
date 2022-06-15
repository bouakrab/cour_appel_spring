package com.example.demo.service;
import com.example.demo.entities.DataPartie;
import com.example.demo.repository.DataPartieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DataPartieService {

    @Autowired
    private DataPartieRepository dataPartieRepository;


    // GET methods
    // Get a list of DataPartie
    public List<DataPartie> getDataPartie() {
        return dataPartieRepository.findAll();
    }

    //get data par id
    public DataPartie getDataPartieByid(int id) {
        return dataPartieRepository.findById(id).orElse(null);
     }

    //POST methods
    //Save dataPartie
    public DataPartie saveDataPartie(DataPartie dataPartie) {
        return dataPartieRepository.save(dataPartie);}

        // Save a list of Plaints
        public List<DataPartie> saveDataPartie (List < DataPartie > dataPartie) {
            return dataPartieRepository.saveAll(dataPartie);
        }

        // Delete method
        public String deleteDataPartie ( int id){
            dataPartieRepository.deleteById(id);
            return " DataPartie " + id + " removed ! ";
        }
        // Update method


    public DataPartie updateDataPartie(DataPartie dataPartie) {
        DataPartie existingDataPartie = dataPartieRepository.findById(dataPartie.getId()).orElse(null);
        existingDataPartie.setSoi(dataPartie.getSoi());
        existingDataPartie.setNom(dataPartie.getNom());
        existingDataPartie.setPrenom(dataPartie.getPrenom());
        existingDataPartie.setGenre(dataPartie.getGenre());
        existingDataPartie.setMorale(dataPartie.getMorale());
        existingDataPartie.setNumCarte(dataPartie.getNumCarte());
        existingDataPartie.setNomDePere(dataPartie.getNomDePere());
        existingDataPartie.setFilleDe(dataPartie.getFilleDe());
        existingDataPartie.setNomDeMere(dataPartie.getNomDeMere());
        existingDataPartie.setDataPartieCol(dataPartie.getDataPartieCol());
        existingDataPartie.setProfession(dataPartie.getProfession());
        existingDataPartie.setLieuDeTravail(dataPartie.getLieuDeTravail());
        existingDataPartie.setNumFinan(dataPartie.getNumFinan());
        existingDataPartie.setDateNaiss(dataPartie.getDateNaiss());
        existingDataPartie.setDataPersonnecol(dataPartie.getDataPersonnecol());
        return dataPartieRepository.save(existingDataPartie);
    }
}
