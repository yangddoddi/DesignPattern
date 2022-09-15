package com.example.design_pattern.structural.composite_pattern.before;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
