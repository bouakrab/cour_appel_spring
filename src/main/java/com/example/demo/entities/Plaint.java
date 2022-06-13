package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Plaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int contreInconnu;
    private String referencePlaints;
    private Date datePlaints;
    private Date dateEnregPlaints;
    private Date dateFaits;
    private String emplaceFaits;
    private String sujetPlaints;

    @ManyToOne(targetEntity = TypePlaints.class)
    @JoinColumn(name = "TypePlaintID")
    private TypePlaints typePlaints;

    @ManyToOne(targetEntity = SourcePlaints.class)
    @JoinColumn(name = "SourcePlaintID")
    private SourcePlaints sourcePlaints;

    @OneToMany(targetEntity = UserHasPlaints.class, mappedBy = "plaint")
    private Collection<UserHasPlaints> userHasPlaints;

    @OneToMany(targetEntity = PlaintHasDataParties.class, mappedBy = "plaint")
    private Collection<PlaintHasDataParties> plaintHasDataParties;

    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "plaint")
    private Collection<PvsReponses> pvsReponses;

}
