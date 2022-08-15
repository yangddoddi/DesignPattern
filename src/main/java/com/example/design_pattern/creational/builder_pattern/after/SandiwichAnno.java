package com.example.design_pattern.creational.builder_pattern.after;

import lombok.Builder;

public class SandiwichAnno {
    private String bread;
    private String lettuce;
    private String ham;
    private String jam;
    private String egg;
    private String chickenTender;
    private String cheese;
    private String avocado;
    private String tomato;

    @Builder
    public SandiwichAnno(String bread, String lettuce, String ham, String jam, String egg) {
        this.bread = bread;
        this.lettuce = lettuce;
        this.ham = ham;
        this.jam = jam;
        this.egg = egg;
    }
}
