package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.*;
import com.narxoz.rpg.enemy.loot.*;

import java.util.Arrays;
import java.util.List;
public class ShadowComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new ShadowStrike(), new Vanish(), new DarkNova());
    }
    @Override
    public LootTable createLootTable() {
        return new ShadowLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "TACTICAL"; // Теневая тема = тактическое поведение
    }
}