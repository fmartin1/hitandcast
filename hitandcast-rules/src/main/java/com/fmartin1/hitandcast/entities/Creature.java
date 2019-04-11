package com.fmartin1.hitandcast.entities;

import com.fmartin1.hitandcast.rules.Combatant;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Creature implements Combatant {
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    @Getter
    @Setter
    @NotNull
    @Size(max = 150)
    protected String name;

    @Getter
    @Setter
    protected int hitPoints;

    private int initiative;

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }
}
