package com.example.design_pattern.structural.decorator_pattern.example2;


import com.example.design_pattern.structural.decorator_pattern.example2.after.*;

public class DecoratorEx2 {

    public static void main(String[] args) {
        Component component = new ComponentImpl();
        Component timeDec = new TimeDecorator(component);
        Component checkDec = new CheckDecorator(timeDec);
        Component mainDec = new MainDecorator(checkDec);

        checkDec.execute();
        System.out.println("...");
        mainDec.execute();
    }
}
