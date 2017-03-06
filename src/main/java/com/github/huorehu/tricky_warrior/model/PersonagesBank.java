package com.github.huorehu.tricky_warrior.model;

import java.util.HashMap;
import java.util.Map;

import com.github.huorehu.tricky_warrior.IPersonagesBank;

public enum PersonagesBank implements IPersonagesBank {

    ELF(), 
    HUMAN(),
    ORC(),
    COSSET();

    private Map<String, Personage> personagesList;

    PersonagesBank() {
	this.personagesList = new HashMap<>();
    }

    @Override
    public PersonagesBank addPersonage(Personage personage) {
	personagesList.put(personage.getName(), personage);
	return this;
    }

    @Override
    public Personage getPersonage(String name) {
	return personagesList.get(name);
    }

}
