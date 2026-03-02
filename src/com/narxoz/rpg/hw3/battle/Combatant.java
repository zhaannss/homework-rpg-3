package com.narxoz.rpg.hw3.battle;

public interface Combatant {
    String getName();
    int getAttackPower();
    void takeDamage(int amount);
    boolean isAlive();
}
