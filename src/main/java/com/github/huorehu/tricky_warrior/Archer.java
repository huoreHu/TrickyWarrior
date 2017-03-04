package com.github.huorehu.tricky_warrior;

public class Archer extends Personage {

    PersonageActions personageActions;

    public Archer(PersonageActions personageActions) {
	this.personageActions = personageActions;
    }

    public void attackEnimy(Personage enemy, String action) {
	enemy.changeHealth(personageActions.getListActions().get(action));
    }

}
