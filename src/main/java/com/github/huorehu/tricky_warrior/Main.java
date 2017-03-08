package com.github.huorehu.tricky_warrior;

import com.github.huorehu.tricky_warrior.model.PersonagesBank;

public class Main {

    public static void main(String[] args) {

	RaceBuilder racebuilder = new RaceBuilder();
	Race oneSide = racebuilder.buildRace(PersonagesBank.ELF);
	Race twoSide = racebuilder.buildRace(PersonagesBank.ORC);
	String name = oneSide.getListPersonage().get(0).getName();
	System.out.println(name);

    }

}
