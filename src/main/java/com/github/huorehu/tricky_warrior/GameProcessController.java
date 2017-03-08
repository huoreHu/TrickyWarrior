package com.github.huorehu.tricky_warrior;

import java.util.Collections;
import java.util.List;

public class GameProcessController {

    private Battlefield battlefield;

    private List<Race> sidesOfBattle;

    public GameProcessController(Battlefield battlefield) {
	this.sidesOfBattle = battlefield.getSidesOfBattle();
    }

    public void controllGame() {
	choiceFirstAttacker();

    }

    private void choiceFirstAttacker() {
	Collections.shuffle(sidesOfBattle);
    }

}
