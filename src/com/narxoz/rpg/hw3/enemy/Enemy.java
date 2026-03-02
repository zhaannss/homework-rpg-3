package com.narxoz.rpg.hw3.enemy;

public interface Enemy {
    String getTitle();
    int getDamage();
    void applyDamage(int amount);
    boolean isDefeated();
}
