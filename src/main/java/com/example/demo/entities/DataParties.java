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

public class DataParties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String soi;
    private String morale;
    private String genre;
    private String prenom;
    private String NumCarte;
    private String NomDePere;
    private String FilsDe;
    private String NomDeMere;
    private String FilleDe;
    private String DataPartieCol;
    private String Profession;
    private String LieuDeTravail;
    private String NumFinan;
    private Date DateNaiss;
    private String DataPersonnecol;

    @ManyToOne(targetEntity = PersonneMorales.class)
    @JoinColumn(name = "PersonneMoraleID")
    private PersonneMorales personneMorales;

    @ManyToOne(targetEntity = Pays.class)
    @JoinColumn(name = "PaysID")
    private Pays pays;

    @ManyToOne(targetEntity = TypeCarteIdents.class)
    @JoinColumn(name = "TypeCarteIdentsID")
    private TypeCarteIdents typeCarteIdents;

    @ManyToOne(targetEntity = SituationFamill.class)
    @JoinColumn(name = "SituationFamillID")
    private SituationFamill situationFamill;

    @ManyToOne(targetEntity = VilleDeNaiss.class)
    @JoinColumn(name = "VilleDeNaissID")
    private VilleDeNaiss villeDeNaiss;

    @ManyToOne(targetEntity = Province.class)
    @JoinColumn(name = "ProvinceID")
    private Province province;

    @ManyToOne(targetEntity = Nationalite.class)
    @JoinColumn(name = "NationaliteID")
    private Nationalite nationalite;

    @OneToMany(targetEntity = PvsHasDataParties.class, mappedBy = "dataParties")
    private Collection<PvsHasDataParties> pvsHasDataParties;

    @OneToMany(targetEntity = PlaintHasDataParties.class, mappedBy = "dataParties")
    private Collection<PlaintHasDataParties> plaintHasDataParties;
}
