package com.narxoz.rpg.hw1.factory.equipment;
import com.narxoz.rpg.hw1.equipment.*;
public class ShadowEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new DarkDagger();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
