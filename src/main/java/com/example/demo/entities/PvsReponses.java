package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PvsReponses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date numEnvoi;
    private Date datePvs;
    private Date heureRealisation;
    private int contreInnconue;

    @ManyToOne(targetEntity = TypePoliceJudics.class)
    @JoinColumn(name = "typePoliceJudicID")
    private TypePoliceJudics typePoliceJudics;

    @ManyToOne(targetEntity = TypeSourcePvs.class)
    @JoinColumn(name = "TypeSourcePvsID")
    private TypeSourcePvs typeSourcePvs;

    @ManyToOne(targetEntity = Plaint.class)
    @JoinColumn(name = "PlaintID")
    private Plaint plaint;

    @ManyToOne(targetEntity = Pvs.class)
    @JoinColumn(name = "PvsID")
    private Pvs pvs;

}
