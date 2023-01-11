package com.example.design_pattern.behavior.strategy_pattern.after;

public class BlueLightRedLight2 {
    private Speed speed;

    public BlueLightRedLight2(Speed speed) {
        this.speed = speed;
    }

    public void blueLight() {
        speed.blueLight();
    }

    public void redLight() {
        speed.redLight();
    }
}
