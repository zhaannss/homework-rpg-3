package com.narxoz.rpg.hw1.factory.equipment;
import com.narxoz.rpg.hw1.equipment.*;
public class HolyEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new HolyWand();
    }
    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
