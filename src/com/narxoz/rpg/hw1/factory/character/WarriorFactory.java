package com.narxoz.rpg.hw1.factory.character;
import com.narxoz.rpg.hw1.character.Character;
import com.narxoz.rpg.hw1.character.Warrior;
public class WarriorFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Warrior(name, race, age, gender);
    }
}
