package com.narxoz.rpg.hw1.factory.equipment;
import com.narxoz.rpg.hw1.equipment.*;
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
