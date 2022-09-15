package com.example.design_pattern.structural.composite_pattern.after;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Equipment implements Component{
    private String name;
    private int price;

    public Equipment(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
