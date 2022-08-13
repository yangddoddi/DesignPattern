package com.example.design_pattern.creational.factorymethod_pattern.after;

public class RabbitMaker extends AnimalMaker{
    @Override
    Animal2 getAnimal(String name) {
        return new Rabbit(name);
    }
}
