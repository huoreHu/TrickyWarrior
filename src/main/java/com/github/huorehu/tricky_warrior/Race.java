package com.github.huorehu.tricky_warrior;

import java.util.ArrayList;
import java.util.List;

import com.github.huorehu.tricky_warrior.model.Personage;

public class Race {

    private List<Personage> listPersonages = new ArrayList<>();

    private final SquadBuilder squadBuilder;

    private final String name;

    public Race(final SquadBuilder squadBuilder) {
	this.squadBuilder = squadBuilder;
	this.name = squadBuilder.getPersonageBank().toString();
    }

    public List<Personage> getListPersonage() {
	return listPersonages;
    }

    public Race addSquadPersonage(String name, int count) {
	this.listPersonages.addAll(squadBuilder.createSquadPersonages(name, count));
	return this;
    }

    public String getName() {
	return name;
    }

}
