package com.example.design_pattern.behavior.strategy_pattern.before;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight color = new BlueLightRedLight(1);
        color.blueLight();
        color.redLight();
    }
}
