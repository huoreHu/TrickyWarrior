package com.github.huorehu.tricky_warrior;

import java.util.ArrayList;
import java.util.List;

public class ArchersBuilder {

    private PersonageActions personageActions;

    public ArchersBuilder(PersonageActions personageActions) {
	this.personageActions = personageActions;
    }

    public List<Personage> generateArchers(int count) {
	List<Personage> archersList = new ArrayList<Personage>();
	for (int i = 0; i < count; i++) {
	    archersList.add(new Archer(this.personageActions));
	}
	return archersList;
    }

}
