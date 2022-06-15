package com.example.demo.repository;

import com.example.demo.entities.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvincesRepository extends JpaRepository <Province,Integer>{

    Province findByNom(String nom);

}
