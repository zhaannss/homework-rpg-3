package com.narxoz.rpg.hw1.factory.equipment;
import com.narxoz.rpg.hw1.equipment.Weapon;
import com.narxoz.rpg.hw1.equipment.Armor;
public interface EquipmentFactory{
    Weapon createWeapon();
    Armor createArmor();
}
