package com.fmartin1.hitandcast.rules;

import com.fmartin1.hitandcast.entities.Monster;
import com.fmartin1.hitandcast.entities.PlayerCharacter;

import java.util.List;

public interface Encounter {
    void addPlayerCharacter(PlayerCharacter playerCharacter);

    List<PlayerCharacter> getPlayerCharacters();

    void addMonster(Monster monster);

    List<Monster> getMonsters();

    int getChallenge();

    void trackInitiatives();

    List<Combatant> getCombatOrder();

    Combatant nextCombatant();
}
