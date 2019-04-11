package com.fmartin1.hitandcast.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class Monster extends Creature implements Comparable<Monster> {
    @Getter
    @Setter
    private MonsterType monsterType;

    @Getter
    @Setter
    private int challenge;

    @Override
    public int compareTo(Monster o) {
        int challengeDiffernce = this.challenge - o.challenge;
        return challengeDiffernce != 0 ? challengeDiffernce : this.name.compareTo(o.name);
    }
}
