package com.example.design_pattern.behavior.template_method_pattern.template_callback;

import com.example.design_pattern.behavior.template_method_pattern.template_callback.FileProcessor;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("아니요");
        int process = fileProcessor.process((result, num) -> result += Integer.parseInt(num));
    }
}
