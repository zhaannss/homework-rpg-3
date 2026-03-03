package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.*;
import com.narxoz.rpg.enemy.loot.*;

import java.util.Arrays;
import java.util.List;
public class FireComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new FlameBreath(), new FireShield(), new MeteorStorm());
    }
    @Override
    public LootTable createLootTable() {
        return new FireLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "AGGRESSIVE"; // Огненная тема = агрессивное поведение
    }
}