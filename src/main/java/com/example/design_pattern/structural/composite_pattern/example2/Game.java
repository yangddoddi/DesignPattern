package com.example.design_pattern.structural.composite_pattern.example2;

public class Game implements File{
    private String name;

    public Game(String name) {
        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println(this.name + " 실행");
    }
}
