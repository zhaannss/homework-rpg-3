package com.narxoz.rpg.hw2.factory;

import com.narxoz.rpg.hw2.combat.*;
import com.narxoz.rpg.hw2.loot.*;

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