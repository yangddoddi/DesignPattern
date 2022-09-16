package com.example.design_pattern.structural.composite_pattern.example2;

public class Utility implements File {
    private String file;

    public Utility(String file) {
        this.file = file;
    }

    @Override
    public void execute() {
        System.out.println(this.file + " 실행");
    }
}
