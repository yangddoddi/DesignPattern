package com.example.design_pattern.structural.composite_pattern.before;

public class User {
    public void printPrice(Item item) {
        System.out.println(item.getPrice());
    }

    public void printPrice(Inventory inventory) {
        System.out.println(
                inventory.getList()
                        .stream()
                        .mapToInt(e -> e.getPrice())
                        .sum()
        );
    }
}
