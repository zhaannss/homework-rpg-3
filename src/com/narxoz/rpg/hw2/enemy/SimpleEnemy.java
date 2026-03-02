package com.narxoz.rpg.hw2.enemy;

import com.narxoz.rpg.hw2.combat.Ability;
import com.narxoz.rpg.hw2.loot.LootTable;

import java.util.List;

public class SimpleEnemy extends BaseEnemy {
    public SimpleEnemy(String name, int health, int damage, int defense, int speed,
                       List<Ability> abilities, LootTable lootTable) {
        super(name, health, damage, defense, speed, abilities, lootTable);
    }
    @Override
    protected Enemy createClone(String name, int health, int damage, int defense, int speed,
                                List<Ability> abilities, LootTable lootTable) {
        return new SimpleEnemy(name, health, damage, defense, speed, abilities, lootTable);
    }

}
