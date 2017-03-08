package com.github.huorehu.tricky_warrior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.huorehu.tricky_warrior.model.PersonagesBank;

public class RaceBuilder {
    
    private List<String> namesPersonages = new ArrayList<>();
    
    private Map<String, Integer> countPersonages = new HashMap<>();

    public Race buildRace(final PersonagesBank personageBank) {
	SquadBuilder squadBuilder = new SquadBuilder(personageBank);
	Race race = new Race(squadBuilder);
	race.addSquadPersonage("Mage", 1)
	    .addSquadPersonage("Archer", 3)
	    .addSquadPersonage("Warrior", 4);
	return race;
    }
    
    public void resetSettings() {
	this.namesPersonages = new ArrayList<>();
	this.countPersonages = new HashMap<>();
    }

    public RaceBuilder setSettingsRaceBuilder(final String namePersonages, final int count) {
	this.namesPersonages.add(namePersonages);
	this.countPersonages.put(namePersonages, count);
        return this;
    }

}
