package com.github.huorehu.tricky_warrior;

import com.github.huorehu.tricky_warrior.model.AttackOptions;

public enum PersonagePowerOfAction implements PersonagePowerWeapon {

    MAGE_ELF(0, 10), MAGE_HUMAN(0, 4), MAGE_ORC(0, 0), MAGE_COSSET(0, 5), ARCHER_ELF(7, 3), ARCHER_HUMAN(5, 3), ARCHER_ORC(3, 2), ARCHER_COSSET(4, 2), WARRIOR_ELF(0, 15), WARRIOR_HUMAN(0, 18), WARRIOR_ORC(0, 20), WARRIOR_COSSET(0, 18);

    private final int powerFarWeapon;

    private final int powerMelee;

    PersonagePowerOfAction(final int powerFarWeapon, final int powerMelee) {
	this.powerFarWeapon = powerFarWeapon;
	this.powerMelee = powerMelee;
    }

    public int getPowerAction(AttackOptions action) {
	if ("powerFarWeapon" == action.toString()) {
	    return getPowerFarWeapon();
	} else {
	    return getPowerMelee();
	}
    }

    private int getPowerFarWeapon() {
	return powerFarWeapon;
    }

    private int getPowerMelee() {
	return powerMelee;
    }

}
