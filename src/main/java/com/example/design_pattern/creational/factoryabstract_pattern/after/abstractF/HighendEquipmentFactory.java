package com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF;

public class HighendEquipmentFactory implements Equipment_Factory {
    @Override
    public Weapon getWeapon() {
        return new HighEndWeapon();
    }

    @Override
    public Shield getShield() {
        return new HighEndShield();
    }
}
