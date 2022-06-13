package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TypePoliceJudics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "typePoliceJudics")
    private Collection<PvsReponses> pvsReponses;

    @OneToMany(targetEntity = Pvs.class, mappedBy = "typePoliceJudics")
    private  Collection<Pvs> pvs;
}
