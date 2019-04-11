package com.fmartin1.hitandcast.rules;

import com.fmartin1.hitandcast.entities.Monster;
import com.fmartin1.hitandcast.entities.PlayerCharacter;

import java.util.*;

public class EncounterImpl implements Encounter {

    private SortedSet<PlayerCharacter> playerCharacters = new TreeSet<>();

    private SortedSet<Monster> monsters = new TreeSet<>();

    public void addPlayerCharacter(PlayerCharacter playerCharacter) {
        playerCharacters.add(playerCharacter);
    }

    public List<PlayerCharacter> getPlayerCharacters() {
        return Collections.unmodifiableList(new ArrayList<>(playerCharacters));
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    public List<Monster> getMonsters() {
        return Collections.unmodifiableList(new ArrayList<>(monsters));
    }

    public int getChallenge() {
        //TODO
        return 0;
    }

    public void trackInitiatives() {
        //TODO
    }

    public List<Combatant> getCombatOrder() {
        List<Combatant> combatants = new ArrayList<>(playerCharacters);
        combatants.addAll(monsters);
        combatants.sort((c1, c2) -> c2.getInitiative() - c1.getInitiative());
        return Collections.unmodifiableList(combatants);
    }

    public Combatant nextCombatant() {
        return null;
    }
}
