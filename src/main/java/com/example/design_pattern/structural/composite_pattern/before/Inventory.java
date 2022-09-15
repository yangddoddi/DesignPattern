package com.example.design_pattern.structural.composite_pattern.before;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Inventory {
    List<Item> list = new ArrayList<>();

    public void add(Item item) {
        list.add(item);
    }
}
