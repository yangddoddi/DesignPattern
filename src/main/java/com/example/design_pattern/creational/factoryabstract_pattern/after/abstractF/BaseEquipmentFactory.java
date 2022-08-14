package com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF;

public class BaseEquipmentFactory implements Equipment_Factory{
    @Override
    public Weapon getWeapon() {
        return new BaseWeapon();
    }

    @Override
    public Shield getShield() {
        return new BaseShield();
    }
}
