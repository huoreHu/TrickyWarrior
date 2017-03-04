package com.github.huorehu.tricky_warrior;

import java.util.HashMap;
import java.util.Map;

public class PersonageActions {

    private Map<String, Integer> listActions = new HashMap<>();

    public PersonageActions(String actionName, Integer actionPower) {
	addAction(actionName, actionPower);
    }

    public PersonageActions addAction(String actionName, Integer actionPower) {
	this.listActions.put(actionName, actionPower);
	return this;
    }

    public Map<String, Integer> getListActions() {
	return listActions;
    }

}
