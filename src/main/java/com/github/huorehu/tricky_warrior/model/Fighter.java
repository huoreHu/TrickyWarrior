package com.github.huorehu.tricky_warrior.model;

import com.github.huorehu.tricky_warrior.IPersonageAction;
import com.github.huorehu.tricky_warrior.ListPersonageActions;

public class Fighter extends Personage implements IPersonageAction {

    public Fighter(String name, ListPersonageActions personageActions) {
	super(name, personageActions);
    }

    @Override
    public void action(Personage personage, String action) {
	personage.changeHealth(this.getListPersonageActions().getAction(action));
    }

}
