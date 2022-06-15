package com.example.demo.repository;

import com.example.demo.entities.SituationFamill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SituationFamillReppository extends JpaRepository<SituationFamill,Integer> {

    SituationFamill findByNom(String nom);
}
