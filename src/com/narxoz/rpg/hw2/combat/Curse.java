package com.narxoz.rpg.hw2.combat;
public class Curse extends BaseAbility {
    public Curse() {
        super("Ancient Curse",
                35,
                "Mark of the crow: consumes health every turn",
                AbilityType.DEBUFF);
    }
    public Curse(Curse source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new Curse(this);
    }
}