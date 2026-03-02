package com.narxoz.rpg.hw1.factory.character;
import com.narxoz.rpg.hw1.character.Character;
import com.narxoz.rpg.hw1.character.Healer;
public class HealerFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Healer(name, race, age, gender);
    }
}
