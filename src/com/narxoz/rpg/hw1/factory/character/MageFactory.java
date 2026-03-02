package com.narxoz.rpg.hw1.factory.character;
import com.narxoz.rpg.hw1.character.Character;
import com.narxoz.rpg.hw1.character.Mage;
public class MageFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Mage(name, race, age, gender);
    }
}
