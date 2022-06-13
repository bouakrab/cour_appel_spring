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


public class Traited {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany(targetEntity = UsersHasPvs.class, mappedBy = "traited")
    private Collection<UsersHasPvs> usersHasPvs;

    @OneToMany(targetEntity = UserHasPlaints.class, mappedBy = "traited")
    private Collection<UserHasPlaints> userHasPlaints;
}
