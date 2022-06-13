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

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String email;
    private String password;

    @ManyToOne(targetEntity = Roles.class)
    private Roles roles;

    @OneToMany(targetEntity = UserHasPlaints.class, mappedBy = "users")
    private Collection<UserHasPlaints> userHasPlaints;


    @OneToMany(targetEntity = UsersHasPvs.class, mappedBy = "users")
    private Collection<UsersHasPvs> usersHasPvs;





}
