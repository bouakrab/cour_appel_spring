package com.example.demo.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsersHasPvs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = Users.class)
    private Users users;

    @ManyToOne(targetEntity = Pvs.class)
    private Pvs pvs;

    @ManyToOne(targetEntity = Traited.class)
    private Traited traited;



}
