package com.example.design_pattern.creational.factorymethod_pattern.after;

public class Turtle extends Animal2 {
    public Turtle(String name) {
        setName(name);
        setSpecies("turtle");
        setColor("green");
    }

    public void run() {
        System.out.println(name + "은 빠르게 달릴 수 없습니다..");
    }
}
