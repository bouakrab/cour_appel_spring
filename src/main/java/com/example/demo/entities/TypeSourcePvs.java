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

public class TypeSourcePvs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany(targetEntity = Pvs.class, mappedBy = "typeSourcePvs")
    private Collection<Pvs> pvsCollection;

    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "typeSourcePvs")
    private Collection<PvsReponses> pvsReponsesCollection;
}
