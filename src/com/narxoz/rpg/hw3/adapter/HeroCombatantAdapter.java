package com.narxoz.rpg.hw3.adapter;

import com.narxoz.rpg.hw3.battle.Combatant;
import com.narxoz.rpg.hw3.hero.Hero;

public class HeroCombatantAdapter implements Combatant {
    private final Hero hero;

    public HeroCombatantAdapter(Hero hero) {
        this.hero = hero;
    }

    @Override
    public String getName() {
        return hero.getName();
    }

    @Override
    public int getAttackPower() {
        // TODO: translate hero power to combat attack
        return hero.getPower();
    }

    @Override
    public void takeDamage(int amount) {
        hero.receiveDamage(amount);
    }

    @Override
    public boolean isAlive() {
        return hero.isAlive();
    }
}
