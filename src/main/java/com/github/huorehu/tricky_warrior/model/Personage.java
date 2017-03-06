package com.github.huorehu.tricky_warrior.model;

import com.github.huorehu.tricky_warrior.ListPersonageActions;

public class Personage {

    private int health = 100;

    private final String name;

    private ListPersonageActions personageActions;

    private WarriorCondition warriorCondition = WarriorCondition.NORMAL;

    public Personage(final String name, final ListPersonageActions personageActions) {
	this.name = name;
	this.personageActions = personageActions;
    }

    public void changeHealth(final int attackPower) {
	this.health -= attackPower * warriorCondition.getCurrentCondition();
	this.warriorCondition = WarriorCondition.NORMAL;
    }

    public int getHealth() {
	return this.health;
    }

    public String getName() {
	return name;
    }

    public void setWarriorCondition(WarriorCondition warriorCondition) {
	this.warriorCondition = warriorCondition;
    }

    public ListPersonageActions getListPersonageActions() {
	return personageActions;
    }

}
