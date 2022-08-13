package com.example.design_pattern.creational.factorymethod_pattern.after;

public class TurtleMaker extends AnimalMaker{
    @Override
    Animal2 getAnimal(String name) {
        return new Turtle(name);
    }
}
