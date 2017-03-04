package com.github.huorehu.tricky_warrior;

public class Personage {

    private int health = 100;

    private WarriorCondition warriorCondition = WarriorCondition.NORMAL;

    public void changeHealth(final int attackPower) {
	this.health -= attackPower * warriorCondition.getCurrentCondition();
	this.warriorCondition = WarriorCondition.NORMAL;
    }

    public int getHealth() {
	return this.health;
    }

    public void setWarriorCondition(WarriorCondition warriorCondition) {
	this.warriorCondition = warriorCondition;
    }

}
