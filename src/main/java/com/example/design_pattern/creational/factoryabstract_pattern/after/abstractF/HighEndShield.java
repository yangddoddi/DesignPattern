package com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF;

import lombok.Data;

@Data
public class HighEndShield extends HighendEquipmentFactory implements Shield{
    String name = "좋은 방패";
}
