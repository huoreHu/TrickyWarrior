package com.github.huorehu.tricky_warrior;

import java.util.ArrayList;
import java.util.List;

import com.github.huorehu.tricky_warrior.model.IPersonagesBank;
import com.github.huorehu.tricky_warrior.model.Personage;

public class SquadBuilder {

    private IPersonagesBank personageBank;

    public SquadBuilder(IPersonagesBank personageBank) {
	this.personageBank = personageBank;
    }

    public List<Personage> createSquadPersonages(final String name, final int count) {
	List<Personage> personagesSquad = new ArrayList<>();
	for (int i = 0; i < count; i++) {
	    personagesSquad.add(personageBank.getPersonage(name));
	}
	return personagesSquad;
    }

    public IPersonagesBank getPersonageBank() {
	return personageBank;
    }

}
