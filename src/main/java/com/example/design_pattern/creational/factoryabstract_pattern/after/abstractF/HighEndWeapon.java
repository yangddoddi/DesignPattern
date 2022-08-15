package com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF;

import lombok.Data;

@Data
public class HighEndWeapon extends HighendEquipmentFactory implements Weapon{
    String name = "좋은 무기";
}
