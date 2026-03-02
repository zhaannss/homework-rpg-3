package com.narxoz.rpg.hero.factory.equipment;
import com.narxoz.rpg.hero.equipment.*;
public class MagicEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new ArcaneStaff();
    }
    @Override
    public Armor createArmor() {
        return new Robe();
    }
}
