package com.example.design_pattern.creational.builder_pattern.after;

import com.example.design_pattern.creational.builder_pattern.before.Sandwich;

public interface SandwichBuilder {
    SandwichBuilder bread(String bread);
    SandwichBuilder lettuce(String lettuce);
    SandwichBuilder ham(String ham);
    SandwichBuilder jam(String jam);
    SandwichBuilder egg(String egg);
    SandwichBuilder chickenTender(String chickenTender);
    SandwichBuilder cheese(String cheese);
    SandwichBuilder avocado(String avocado);
    SandwichBuilder tomato(String tomato);
    Sandwich getSandwich();
}
