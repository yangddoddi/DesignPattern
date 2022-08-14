package com.example.design_pattern.creational.factoryabstract_pattern.after;

import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.BaseEquipmentFactory;
import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.Equipment_Factory;
import com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM.CharacterV2;
import com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM.Factory_Method;
import com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM.WarriorMaker;
import com.example.design_pattern.creational.factoryabstract_pattern.before.Character;

public class FactoryAbstract_Main {
    public static void main(String[] args) {
        // 기존
        Character Kim = new Character("김씨", Job.MAGICIAN);
        Kim.setBasicShield(new BasicShield());
        Kim.setBasicWeapon(new BasicWeapon());
        //추상팩토리
        Equipment_Factory equipment = new BaseEquipmentFactory();
        //추상메서드
        Factory_Method characterFactory = new WarriorMaker();
        CharacterV2 hehe = characterFactory.createOrder("힝힝이", equipment);
    }
}
