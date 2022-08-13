package com.example.design_pattern.creational.factorymethod_pattern.after;

import com.example.design_pattern.creational.factorymethod_pattern.before.Animal;

public class FactoryMethod_Main {
    public static void main (String[] args) {
        Animal animal1 = new Animal("해피","turtle", "green");
        Animal animal2 = new Animal("초롱이","rabbit", "black");

        Animal2 rabbit = new RabbitMaker().createAnimal("해피");
        Animal2 turtle = new TurtleMaker().createAnimal("초롱이");

        rabbit.run();
        turtle.run();

        animal_run(new RabbitMaker(), "이춘삼");
        animal_run(new TurtleMaker(), "김수한무");
    }

    public static void animal_run(AnimalMaker animalMaker, String name) {
        animalMaker.createAnimal(name).run();
    }
}
