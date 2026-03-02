package com.narxoz.rpg.hero.character;
import com.narxoz.rpg.hero.equipment.Weapon;
import com.narxoz.rpg.hero.equipment.Armor;
public interface Character {
    String getName();
    String getRace();
    int getAge();
    String getGender();

    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();
    int getAgility();

    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
    void displayEquipment();

    void displayStats();
    void useSpecialAbility();

    /**
     * Base interface for all character types in the RPG system.
     *
     * TODO: Decide if this should be an interface or abstract class
     * Think: What's common to ALL characters?
     * Think: What varies between character types?
     *
     * Factory Method Pattern:
     * This represents the "Product" in the Factory Method pattern.
     * Different character classes (Warrior, Mage, Archer) are concrete products.
     */
    // TODO: Define common character behaviors
    // Consider methods like:
    // - String getName()
    // - int getHealth()
    // - int getMana()
    // - int getStrength()
    // - int getIntelligence()
    // - void displayStats()
    // - void useSpecialAbility()
    // TODO: Think about equipment
    // Should characters know about their equipped items?
    // How will you handle equipping weapons and armor?

}
