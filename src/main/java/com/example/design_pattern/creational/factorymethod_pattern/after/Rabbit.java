package com.example.design_pattern.creational.factorymethod_pattern.after;

public class Rabbit extends Animal2 {
    public Rabbit(String name) {
        setName(name);
        setSpecies("rabbit");
        setColor("white");
    }

    public void run() {
        System.out.println(name + "가 깡총깡총 뛰어갑니다!");
    }
}
