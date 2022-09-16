package com.example.design_pattern.structural.decorator_pattern.example2.after;

public class CheckDecorator extends MainDecorator {
    public CheckDecorator(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        check();
        super.execute();
    }

    public void check() {
        System.out.println("CheckDecorator . . . Check");
    }
}
