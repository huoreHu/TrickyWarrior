package com.github.huorehu.tricky_warrior;

import java.util.List;

public class Race {

    private List<Personage> listPersonage;

    public Race(final List<Personage> listPersonage) {
	this.listPersonage = listPersonage;
    }

    public List<Personage> getListPersonage() {
	return listPersonage;
    }

    public Race addListPersonage(List<Personage> listPersonage) {
	this.listPersonage.addAll(listPersonage);
	return this;
    }
}
