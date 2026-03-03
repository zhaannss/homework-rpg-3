package com.narxoz.rpg.hero.factory.equipment;
import com.narxoz.rpg.hero.equipment.*;
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
