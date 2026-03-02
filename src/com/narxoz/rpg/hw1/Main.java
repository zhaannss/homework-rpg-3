package com.narxoz.rpg.hw1;

import com.narxoz.rpg.hw1.character.Character;
import com.narxoz.rpg.hw1.factory.character.*;
import com.narxoz.rpg.hw1.factory.character.CharacterFactory;
import com.narxoz.rpg.hw1.factory.character.WarriorFactory;
import com.narxoz.rpg.hw1.factory.equipment.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        CharacterFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter("Leon", "Human", 26, "Male");
        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        warrior.equipWeapon(medievalFactory.createWeapon());
        warrior.equipArmor(medievalFactory.createArmor());
        System.out.println("Creating Warrior...");
        warrior.displayStats();
        warrior.useSpecialAbility();
        warrior.displayEquipment();
        System.out.println("\n-----------------------------\n");

        CharacterFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter("Galadriel", "Elf", 95, "Female"); //властелин кооллец
        EquipmentFactory magicFactory = new MagicEquipmentFactory();
        mage.equipWeapon(magicFactory.createWeapon());
        mage.equipArmor(magicFactory.createArmor());
        System.out.println("Creating Mage...");
        mage.displayStats();
        mage.useSpecialAbility();
        mage.displayEquipment();
        System.out.println("\n-----------------------------\n");

        CharacterFactory healerFactory = new HealerFactory();
        Character healer = healerFactory.createCharacter("Hanna", "Witch", 35, "Female");
        EquipmentFactory holyFactory = new HolyEquipmentFactory();
        healer.equipWeapon(holyFactory.createWeapon());
        healer.equipArmor(holyFactory.createArmor());
        System.out.println("Creating Healer...");
        healer.displayStats();
        healer.useSpecialAbility();
        healer.displayEquipment();
        System.out.println("\n-----------------------------\n");




        /**
         * Main demonstration class for the RPG Character & Equipment System.
         *
         * Your task: Demonstrate both Factory Method and Abstract Factory patterns working together.
         *
         * This file should showcase:
         * 1. Creating different character types using Factory Method pattern
         * 2. Equipping characters with themed equipment using Abstract Factory pattern
         * 3. Displaying character stats and equipment details
         *
         * Expected output flow:
         * - Create 3+ different characters
         * - Equip each with different themed equipment sets
         * - Show that the system is extensible and maintainable
         */

        // TODO: Demonstrate Factory Method Pattern
        // Create different character types (Warrior, Mage, Archer, etc.)
        // Think: How can you create characters without using if-else chains?
        // Think: What class/interface should handle character creation?


        // TODO: Demonstrate Abstract Factory Pattern
        // Create equipment sets (Medieval, Magic, Ranger, etc.)
        // Think: How do you ensure weapons and armor from same theme are created together?
        // Think: What guarantees a Medieval sword comes with Medieval armor?


        // TODO: Show character stats
        // Display each character's attributes (health, mana, strength, intelligence)
        // Show their special abilities


        // TODO: Equip characters with different themed sets
        // Warrior with Medieval equipment
        // Mage with Magic equipment
        // Archer with Ranger equipment
        // etc.


        // TODO: Display equipped items
        // Show weapon details (damage, special properties)
        // Show armor details (defense, special properties)


        // TODO: (Optional) Demonstrate extensibility
        // In comments, explain how easy it would be to:
        // - Add a new character class (e.g., Rogue, Paladin)
        // - Add a new equipment theme (e.g., Dragon Slayer, Undead)


        System.out.println("\n=== Demo Complete ===");
    }

    // TODO: Add helper methods as needed
    // Consider methods like:
    // - createAndDisplayCharacter(...)
    // - equipCharacter(...)
    // - displayCharacterInfo(...)
}
