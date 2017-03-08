package com.github.huorehu.tricky_warrior.model;

import com.github.huorehu.tricky_warrior.PersonagePowerWeapon;

public class Personage {

    private int health = 100;

    private final String name;

    private PersonagePowerWeapon powerWeapon;

    private WarriorCondition warriorCondition = WarriorCondition.NORMAL;

    public Personage(final String name, PersonagePowerWeapon powerWeapon) {
	this.name = name;
	this.powerWeapon = powerWeapon;
    }

    public void actionTo(Personage personage, AttackOptions action) {
	personage.changeHealth(powerWeapon.getPowerAction(action));
    }

    private void changeHealth(final int attackPower) {
	this.health -= attackPower * warriorCondition.getCurrentCondition();
	this.warriorCondition = WarriorCondition.NORMAL;
    }

    public int getHealth() {
	return this.health;
    }

    public String getName() {
	return name;
    }

    public WarriorCondition getWarriorCondition() {
	return warriorCondition;
    }

    public void setWarriorCondition(WarriorCondition warriorCondition) {
	this.warriorCondition = warriorCondition;
    }

}
