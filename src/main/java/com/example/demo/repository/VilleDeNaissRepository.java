package com.example.demo.repository;

import com.example.demo.entities.VilleDeNaiss;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VilleDeNaissRepository  extends JpaRepository<VilleDeNaiss,Integer> {
    VilleDeNaiss  findByNom(String nom);
}
