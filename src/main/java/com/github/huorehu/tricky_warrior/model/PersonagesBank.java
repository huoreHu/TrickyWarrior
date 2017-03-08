package com.github.huorehu.tricky_warrior.model;

import java.util.HashMap;
import java.util.Map;

public enum PersonagesBank implements IPersonagesBank {

    ELF(new HashMap<>()), 
    HUMAN(new HashMap<>()),
    ORC(new HashMap<>()),
    COSSET(new HashMap<>());

    private Map<String, Personage> personagesList;

    PersonagesBank(Map<String, Personage> personagesList) {
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
