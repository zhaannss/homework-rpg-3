package com.narxoz.rpg.hero.factory.equipment;
import com.narxoz.rpg.hero.equipment.*;
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
