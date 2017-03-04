package com.github.huorehu.tricky_warrior;

public class Main {

    public static void main(String[] args) {

	ArchersBuilder archersBuilder = new ArchersBuilder(new PersonageActions("attackArchery", 7).addAction("attackInMelee", 3));
	Race race = new Race(archersBuilder.generateArchers(10));
	Battlefield battlefield = new Battlefield(race);
	battlefield.addSideOfBattle(race);

    }

}
