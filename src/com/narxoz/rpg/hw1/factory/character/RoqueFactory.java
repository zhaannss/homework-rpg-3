package com.narxoz.rpg.hw1.factory.character;
import com.narxoz.rpg.hw1.character.Character;
import com.narxoz.rpg.hw1.character.Roque;
public class RoqueFactory extends CharacterFactory {
    @Override
    public Character createCharacter(String name, String race, int age, String gender) {
        return new Roque(name, race, age, gender);
    }
}
