package com.narxoz.rpg.enemy.factory;

import com.narxoz.rpg.enemy.combat.*;
import com.narxoz.rpg.enemy.loot.*;

import java.util.Arrays;
import java.util.List;
public class WitchcraftComponentFactory implements EnemyComponentFactory {
    @Override
    public List<Ability> createAbilities() {
        return Arrays.asList(new Curse(), new VenomousBite(), new SoulHarvest());
    }
    @Override
    public LootTable createLootTable() {
        return new WitchcraftLootTable();
    }
    @Override
    public String createAIBehavior() {
        return "CHAOTIC"; // Колдовство = непредсказуемое поведение
    }
}