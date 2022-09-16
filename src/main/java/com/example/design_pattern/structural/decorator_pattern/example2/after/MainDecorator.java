package com.example.design_pattern.structural.decorator_pattern.example2.after;

public class MainDecorator extends ComponentImpl {
    private final Component component;

    public MainDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void execute() {
        System.out.println("MainDecorator . . Main");
    }
}
