package com.fmartin1.hitandcast.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MonsterType {
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    @Getter
    @Setter
    @NotNull
    @Size(max = 150)
    private String name;

    @Getter
    @Setter
    @NotNull
    private int challenge;
}
