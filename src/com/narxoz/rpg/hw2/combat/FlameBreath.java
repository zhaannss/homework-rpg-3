package com.narxoz.rpg.hw2.combat;
public class FlameBreath extends BaseAbility {
    public FlameBreath() {
        super("Flame Breath",
                50,
                "AoE fire damage + burn effect",
                AbilityType.DAMAGE);
    }
    public FlameBreath(FlameBreath source) {
        super(source);
    }
    @Override
    public Ability clone() {
        return new FlameBreath(this);
    }
}