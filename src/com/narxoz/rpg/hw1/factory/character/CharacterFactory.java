package com.narxoz.rpg.hw1.factory.character;
import com.narxoz.rpg.hw1.character.Character;
public abstract class CharacterFactory {
    public abstract Character createCharacter(
            String name,
            String race,
            int age,
            String gender
    );
}
