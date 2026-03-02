package com.narxoz.rpg.hw3.hero;

public interface Hero {
    String getName();
    int getPower();
    void receiveDamage(int amount);
    boolean isAlive();
}
