package com.example.design_pattern.structural.decorator_pattern.example2.after;

public class ValidateDecorator extends MainDecorator {
    public ValidateDecorator(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        validate();
        super.execute();
    }

    public void validate() {
        System.out.println("ValidateDecorator . . Vaildate");
    }
}
