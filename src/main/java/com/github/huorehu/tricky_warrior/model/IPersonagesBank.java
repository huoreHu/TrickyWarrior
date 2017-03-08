package com.github.huorehu.tricky_warrior.model;

public interface IPersonagesBank {

    public IPersonagesBank addPersonage(Personage personage);

    public Personage getPersonage(String name);

}
