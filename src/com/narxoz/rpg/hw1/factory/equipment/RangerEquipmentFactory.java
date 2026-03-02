package com.narxoz.rpg.hw1.factory.equipment;
import com.narxoz.rpg.hw1.equipment.*;
public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Elvenbow();
    }
    @Override
    public Armor createArmor() {
        return new LeatherArmor();
    }
}
