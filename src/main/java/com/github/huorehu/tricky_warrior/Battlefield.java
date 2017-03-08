package com.github.huorehu.tricky_warrior;

import java.util.ArrayList;
import java.util.List;

public class Battlefield {

    private List<Race> sidesOfBattle = new ArrayList<>();

    public Battlefield(Race... race) {
	for (int i = 0; i < race.length; i++) {
	    this.addSideOfBattle(race[i]);
	}
    }

    public void addSideOfBattle(Race race) {
	this.sidesOfBattle.add(race);
    }

    public List<Race> getSidesOfBattle() {
	return sidesOfBattle;
    }

}
