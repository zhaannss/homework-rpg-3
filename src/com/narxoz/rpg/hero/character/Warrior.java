package com.narxoz.rpg.hero.character;
public class Warrior extends BaseCh {
    public Warrior(String name, String race, int age, String gender) {
        super(name, race, age, gender);
        this.health = 200;
        this.mana = 40;
        this.strength = 120;
        this.intelligence = 70;
        this.agility = 60;
    }
    @Override
    public void useSpecialAbility() {
        System.out.println(name + "uses Berserk! Strength increased temporarily!");
    }

// Example concrete implementation of a Character.

// This is provided as a reference to help you get started.
// Study this implementation, then create similar classes for Mage, Archer, etc.

// Notice:
// How attributes are initialized
// How methods are implemented
// The structure you should follow for other character types

// TODO: Create similar implementations for:
// Mage (high mana/intelligence, low health/strength)
// Archer (balanced stats, ranged combat)
// (Optional) Additional classes: Rogue, Paladin, etc.
// TODO: Add fields for equipped weapon and armor
    // Think: Should Warrior know about its equipment?


// TODO: Implement methods from Character interface
    // You need to define those methods in Character interface first!

    // Example method structure:
// TODO: Add equipment-related methods
    // Examples:
    // - void equipWeapon(Weapon weapon)
    // - void equipArmor(Armor armor)
    // - void displayEquipment()
}
