package com.example.design_pattern.structural.bridge_pattern;

import com.example.design_pattern.structural.bridge_pattern.after2.BaseShape;
import com.example.design_pattern.structural.bridge_pattern.after2.Blue;
import com.example.design_pattern.structural.bridge_pattern.after2.Red;
import com.example.design_pattern.structural.bridge_pattern.before2.BlackTriangle;
import com.example.design_pattern.structural.bridge_pattern.before2.RedSquare;
import com.example.design_pattern.structural.bridge_pattern.before2.Shape;
import com.example.design_pattern.structural.bridge_pattern.before2.YellowTriangle;

public class Shape_App {
    public static void main(String[] args) {
        // before
        Shape blackTriangle = new BlackTriangle();
        blackTriangle.fill();
        Shape redSquare = new RedSquare();
        redSquare.fill();
        Shape yellowTriangle = new YellowTriangle();
        yellowTriangle.fill();
        // after
        Shape blackTriangle2 = new BaseShape(new Blue(), "세모");
        blackTriangle2.fill();
        Shape redSquare2 = new BaseShape(new Red(), "네모네모");
        redSquare2.fill();
    }
}
