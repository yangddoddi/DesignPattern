package com.example.design_pattern.structural.decorator_pattern.example2.after;

public class TimeDecorator extends MainDecorator {
    public TimeDecorator(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        time();
        super.execute();
    }

    public void time() {
        System.out.println("TimeDecorator . . . time");
    }
}
