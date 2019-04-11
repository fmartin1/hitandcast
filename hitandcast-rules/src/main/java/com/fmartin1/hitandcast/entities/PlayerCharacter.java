package com.fmartin1.hitandcast.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public abstract class PlayerCharacter extends Creature implements Comparable<PlayerCharacter> {
    @Getter
    @Setter
    private int level;

    public int compareTo(PlayerCharacter o) {
        int levelDifference = this.level - o.level;
        return levelDifference != 0 ? levelDifference : this.name.compareTo(o.name);
    }
}
