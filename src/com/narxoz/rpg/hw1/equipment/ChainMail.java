package com.narxoz.rpg.hw1.equipment;
public class ChainMail implements Armor {

    @Override
    public int getDefense() {
        return 40; // средняя защита
    }
    @Override
    public String getArmorInfo() {
        return "Chain Mail: Medium armor made of interlocked metal rings. " +
                "Provides balanced protection and mobility.";
    }
    @Override
    public String getArmorType() {
        return "Medium Armor";
    }
}
