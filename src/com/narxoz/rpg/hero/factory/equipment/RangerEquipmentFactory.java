package com.narxoz.rpg.hero.factory.equipment;
import com.narxoz.rpg.hero.equipment.*;
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
