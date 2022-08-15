package com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF;

import lombok.Data;

@Data
public class BaseWeapon extends BaseEquipmentFactory implements Weapon {
    String name = "평범한 무기";
}
