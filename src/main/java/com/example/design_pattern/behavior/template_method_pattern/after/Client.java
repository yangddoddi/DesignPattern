package com.example.design_pattern.behavior.template_method_pattern.after;

import com.example.design_pattern.behavior.template_method_pattern.before.FileProcessor;

public class Client {
    public static void main(String[] args) {
        new FileProcessor("c://diver.exe");
    }
}
