package com.narxoz.rpg;
import com.narxoz.rpg.adapter.Combatant;
import com.narxoz.rpg.adapter.HeroCombatantAdapter;
import com.narxoz.rpg.adapter.EnemyCombatantAdapter;
import com.narxoz.rpg.battle.BattleEngine;
import com.narxoz.rpg.battle.EncounterResult;
import com.narxoz.rpg.enemy.builder.BossEnemyBuilder;
import com.narxoz.rpg.enemy.builder.EnemyDirector;
import com.narxoz.rpg.enemy.builder.SimpleEnemyBuilder;
import com.narxoz.rpg.enemy.enemy.Enemy;
import com.narxoz.rpg.enemy.factory.FireComponentFactory;
import com.narxoz.rpg.enemy.factory.IceComponentFactory;
import com.narxoz.rpg.enemy.factory.ShadowComponentFactory;
import com.narxoz.rpg.hero.character.BaseCh;
import com.narxoz.rpg.hero.factory.character.WarriorFactory;
import com.narxoz.rpg.hero.factory.character.MageFactory;
import com.narxoz.rpg.hero.factory.character.ArcherFactory;
import com.narxoz.rpg.hero.factory.equipment.MedievalEquipmentFactory;
import com.narxoz.rpg.hero.factory.equipment.MagicEquipmentFactory;
import com.narxoz.rpg.hero.factory.equipment.RangerEquipmentFactory;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        // 1. SINGLETON — доказываем что экземпляр один

        System.out.println("=== Singleton Check ===");
        BattleEngine engine1 = BattleEngine.getInstance();
        BattleEngine engine2 = BattleEngine.getInstance();
        System.out.println("engine1 == engine2: " + (engine1 == engine2)); // true

        // Устанавливаем seed для воспроизводимого боя
        BattleEngine.getInstance().setRandomSeed(42L);

        // 2. СОЗДАЁМ ГЕРОЕВ через Factory (HW1)
        System.out.println("\n=== Creating Heroes ===");

        BaseCh warrior = (BaseCh) new WarriorFactory()
                .createCharacter("Aragorn", "Human", 35, "Male");
        warrior.equipWeapon(new MedievalEquipmentFactory().createWeapon());
        warrior.equipArmor(new MedievalEquipmentFactory().createArmor());
        warrior.displayStats();

        BaseCh mage = (BaseCh) new MageFactory()
                .createCharacter("Gandalf", "Elf", 200, "Male");
        mage.equipWeapon(new MagicEquipmentFactory().createWeapon());
        mage.equipArmor(new MagicEquipmentFactory().createArmor());
        mage.displayStats();

        BaseCh archer = (BaseCh) new ArcherFactory()
                .createCharacter("Legolas", "Elf", 150, "Male");
        archer.equipWeapon(new RangerEquipmentFactory().createWeapon());
        archer.equipArmor(new RangerEquipmentFactory().createArmor());
        archer.displayStats();

        // 3. СОЗДАЁМ ВРАГОВ через Builder + Director (HW2)

        System.out.println("\n=== Creating Enemies ===");
        EnemyDirector director = new EnemyDirector();

        Enemy goblin = director.createMinion(
                new SimpleEnemyBuilder(), new FireComponentFactory());
        goblin.setName("Goblin");
        goblin.displayInfo();

        Enemy iceElite = director.createElite(
                new SimpleEnemyBuilder(), new IceComponentFactory());
        iceElite.setName("Ice Warrior");
        iceElite.displayInfo();

        Enemy shadowBoss = director.createMiniBoss(
                new BossEnemyBuilder(), new ShadowComponentFactory());
        shadowBoss.setName("Shadow Guardian");
        shadowBoss.displayInfo();


        // 4. ADAPTER — оборачиваем всех в Combatant

        System.out.println("\n=== Adapter Check ===");

        List<Combatant> teamA = new ArrayList<>();
        teamA.add(new HeroCombatantAdapter(warrior));
        teamA.add(new HeroCombatantAdapter(mage));
        teamA.add(new HeroCombatantAdapter(archer));

        List<Combatant> teamB = new ArrayList<>();
        teamB.add(new EnemyCombatantAdapter(goblin));
        teamB.add(new EnemyCombatantAdapter(iceElite));
        teamB.add(new EnemyCombatantAdapter(shadowBoss));

        System.out.println("Team A adapters — all Combatant: true");
        System.out.println("Team B adapters — all Combatant: true");


        // 5. БОЙ через BattleEngine (Singleton)

        EncounterResult result = BattleEngine.getInstance()
                .runEncounter(teamA, teamB);

        System.out.println(result);
    }
}