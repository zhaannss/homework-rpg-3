package com.narxoz.rpg.hero.factory.equipment;
import com.narxoz.rpg.hero.equipment.*;
public class MedievalEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword();
    }
    @Override
    public Armor createArmor() {
        return new ChainMail();
    }
}
