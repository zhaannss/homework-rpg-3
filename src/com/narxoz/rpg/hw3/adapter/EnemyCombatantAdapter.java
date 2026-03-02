package com.narxoz.rpg.hw3.adapter;

import com.narxoz.rpg.hw3.battle.Combatant;
import com.narxoz.rpg.hw3.enemy.Enemy;

public class EnemyCombatantAdapter implements Combatant {
    private final Enemy enemy;

    public EnemyCombatantAdapter(Enemy enemy) {
        this.enemy = enemy;
    }

    @Override
    public String getName() {
        return enemy.getTitle();
    }

    @Override
    public int getAttackPower() {
        // TODO: translate enemy damage to combat attack
        return enemy.getDamage();
    }

    @Override
    public void takeDamage(int amount) {
        enemy.applyDamage(amount);
    }

    @Override
    public boolean isAlive() {
        return !enemy.isDefeated();
    }
}
