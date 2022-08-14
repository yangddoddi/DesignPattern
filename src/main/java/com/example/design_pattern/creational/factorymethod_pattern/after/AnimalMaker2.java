package com.example.design_pattern.creational.factorymethod_pattern.after;

public class AnimalMaker2 {
    protected Animal2 createAnimal(String name, String species) {
        validate(name, species);
        Animal2 animal2 = getAnimal(name, species);
        return animal2;
    }

    private void validate(String name, String species) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("유효하지 않은 이름");
        }
        if (!species.equals("rabbit") && !species.equals("turtle")) {
            throw new IllegalArgumentException("유효하지 않은 개체");
        }
    }

    private Animal2 getAnimal(String name, String species) {
        if (species.equals("rabbit")) {
            return new Rabbit(name);
        }
        if (species.equals("turtle")) {
            return new Turtle(name);
        }
        throw new RuntimeException();
    }
}
