package com.github.huorehu.tricky_warrior.model;

public enum WarriorCondition {

    NORMAL(1), SUPER(2), DISEASE(3);

    private int condition;

    WarriorCondition(int condition) {
	this.condition = condition;
    }
    
    public int getCurrentCondition() {
	return condition;
    }

}
