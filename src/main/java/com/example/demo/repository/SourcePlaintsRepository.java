package com.example.demo.repository;

import com.example.demo.entities.SourcePlaints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SourcePlaintsRepository extends JpaRepository<SourcePlaints, Integer> {
    SourcePlaints findByNom(String nom);
}
