package com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF;

import lombok.ToString;

@ToString
public class BaseShield extends BaseEquipmentFactory implements Shield {
    String name = "평범한 방패";
}
