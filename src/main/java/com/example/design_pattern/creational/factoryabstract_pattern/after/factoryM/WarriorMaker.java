package com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM;

public class WarriorMaker implements Factory_Method{
    @Override
    public CharacterV2 getCharacter() {
        return new Warrior();
    }
}
