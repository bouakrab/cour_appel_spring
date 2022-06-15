package com.example.demo.repository;

import com.example.demo.entities.PersonneMorale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PersonneMoraleRepository extends JpaRepository<PersonneMorale,Integer> {
    PersonneMorale findByNom(String nom);
}
