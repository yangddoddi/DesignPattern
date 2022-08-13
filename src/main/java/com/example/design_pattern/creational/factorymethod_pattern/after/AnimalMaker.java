package com.example.design_pattern.creational.factorymethod_pattern.after;

public abstract class AnimalMaker {
    protected Animal2 createAnimal(String name) {
        validate(name);
        Animal2 animal2 = getAnimal(name);
        return animal2;
    }

    private void validate(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("유효하지 않은 이름");
        }
    }

    abstract Animal2 getAnimal(String name);
}
