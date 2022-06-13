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
public class Pvs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int numEnvoi;
    private Date datePvs;
    private Date heureRealisation;
    private int contreInnconue;

    @ManyToOne(targetEntity = TypePoliceJudics.class)
    private TypePoliceJudics typePoliceJudics;

    @ManyToOne(targetEntity = TypeSourcePvs.class)
    private TypeSourcePvs typeSourcePvs;

    @ManyToOne(targetEntity = SourcePvs.class)
    private SourcePvs sourcePvs;

    @OneToMany(targetEntity = UsersHasPvs.class, mappedBy = "pvs")
    private Collection<UsersHasPvs> usersHasPvs;

    @OneToMany(targetEntity = PvsHasDataParties.class, mappedBy = "pvs")
    private Collection<PvsHasDataParties> pvsHasDataParties;

    @OneToMany(targetEntity = PvsReponses.class, mappedBy = "pvs")
    private Collection<PvsReponses> pvsReponses;
}
