package com.example.design_pattern.behavior.strategy_pattern.before;

public class BlueLightRedLight {
    private int speed;

    public BlueLightRedLight(int speed) {
        this.speed = speed;
    }

    public void blueLight() {
        if (speed == 1) {
            System.out.println("무궁화 꽃이");
        } else if (speed == 2) {
            System.out.println("무화꽃");
        }
    }

    public void redLight() {
        if (speed == 1) {
            System.out.println("피었습니다.");
        } else if (speed == 2) {
            System.out.println("다다닻");
        }
    }
}
