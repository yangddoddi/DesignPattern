package com.example.design_pattern.creational.builder_pattern.after;

import com.example.design_pattern.creational.builder_pattern.before.Sandwich;

public class CustomSandwichBuilder implements SandwichBuilder {
    private String bread;
    private String lettuce;
    private String ham;
    private String jam;
    private String egg;
    private String chickenTender;
    private String cheese;
    private String avocado;
    private String tomato;

    @Override
    public SandwichBuilder bread(String bread) {
        this.bread = bread;
        return this;
    }

    @Override
    public SandwichBuilder lettuce(String lettuce) {
        this.lettuce = lettuce;
        return this;
    }

    @Override
    public SandwichBuilder ham(String ham) {
        this.ham = ham;
        return this;
    }

    @Override
    public SandwichBuilder jam(String jam) {
        this.jam = jam;
        return this;
    }

    @Override
    public SandwichBuilder egg(String egg) {
        this.egg = egg;
        return this;
    }

    @Override
    public SandwichBuilder chickenTender(String chickenTender) {
        this.egg = egg;
        return this;
    }

    @Override
    public SandwichBuilder cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public SandwichBuilder avocado(String avocado) {
        this.avocado = avocado;
        return this;
    }

    @Override
    public SandwichBuilder tomato(String tomato) {
        this.tomato = tomato;
        return this;
    }

    public Sandwich getSandwich() {
        if (bread == null) throw new IllegalArgumentException("빵이 있어야 샌드위치죠..");
        return new Sandwich(bread, lettuce, ham, jam, egg, chickenTender, cheese, avocado, tomato);
    }
}
