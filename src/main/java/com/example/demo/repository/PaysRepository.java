package com.example.demo.repository;

import com.example.demo.entities.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PaysRepository extends JpaRepository<Pays,Integer> {
    Pays findByNom(String nom);

}
