package com.example.demo.repository;

import com.example.demo.entities.TypeCarteIdents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCarteIdentRepository extends JpaRepository<TypeCarteIdents,Integer> {
    TypeCarteIdents findByNom(String nom);
}
