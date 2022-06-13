package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserHasPlaints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = Plaint.class)
    private Plaint plaint;

    @ManyToOne(targetEntity = Users.class)
    private Users users;

    @ManyToOne(targetEntity = Traited.class)
    private Traited traited;
}
