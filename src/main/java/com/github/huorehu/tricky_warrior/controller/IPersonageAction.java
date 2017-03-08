package com.github.huorehu.tricky_warrior.controller;

import com.github.huorehu.tricky_warrior.model.AttackOptions;
import com.github.huorehu.tricky_warrior.model.Personage;

public interface IPersonageAction {

    public void actionTo(Personage personage, AttackOptions action);

}
