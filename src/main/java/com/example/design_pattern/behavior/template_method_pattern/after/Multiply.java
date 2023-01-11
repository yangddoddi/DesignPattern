package com.example.design_pattern.behavior.template_method_pattern.after;

public class Multiply extends FileProcessor {
    public Multiply(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, String line) {
        return 0;
    }
}
