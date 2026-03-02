package com.narxoz.rpg.hw2.factory;

import com.narxoz.rpg.hw2.combat.*;
import com.narxoz.rpg.hw2.loot.*;

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