package com.github.huorehu.tricky_warrior.model;

import com.github.huorehu.tricky_warrior.PersonagePowerWeapon;
import com.github.huorehu.tricky_warrior.controller.IPersonageAction;

public class Mage extends Personage implements IPersonageAction {

    public Mage(String name, PersonagePowerWeapon powerWeapon) {
	super(name, powerWeapon);
    }

    @Override
    public void actionTo(Personage personage, AttackOptions action) {
	if ("improvement" == action.toString()) {
	    personage.setWarriorCondition(WarriorCondition.SUPER);
	    ;
	}
	if ("curse" == action.toString()) {
	    personage.setWarriorCondition(WarriorCondition.NORMAL);
	    ;
	}
	if ("disease" == action.toString()) {
	    personage.setWarriorCondition(WarriorCondition.DISEASE);
	    ;
	} else {
	    super.actionTo(personage, action);
	}

    }

}
