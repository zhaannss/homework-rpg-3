package com.narxoz.rpg.hero.factory.equipment;
import com.narxoz.rpg.hero.equipment.Weapon;
import com.narxoz.rpg.hero.equipment.Armor;
public interface EquipmentFactory{
    Weapon createWeapon();
    Armor createArmor();
}
