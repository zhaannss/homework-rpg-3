package com.narxoz.rpg.hw2.combat;
public class IceShield extends BaseAbility {
    public IceShield() {
        super("Ice Shield",
                5,
                "Defensive buff that reduces incoming damage",
                AbilityType.DEFENSIVE);
    }
    public IceShield(IceShield source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new IceShield(this);
    }
}