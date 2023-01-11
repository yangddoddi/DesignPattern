package com.example.design_pattern.behavior.strategy_pattern.after;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight2 light = new BlueLightRedLight2(new Normal());
        light.blueLight();

        BlueLightRedLight2 light2 = new BlueLightRedLight2(new Faster());
        light2.redLight();
        /*
        * 혹은 컴포짓 패턴이 아닌 인자로 줘도 됨
        * */
    }
}
