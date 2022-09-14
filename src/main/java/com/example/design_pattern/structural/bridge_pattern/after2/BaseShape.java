package com.example.design_pattern.structural.bridge_pattern.after2;

import com.example.design_pattern.structural.bridge_pattern.before2.Shape;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BaseShape implements Shape {
    private final Color color;
    private final String name;

    @Override
    public void fill() {
        System.out.println(this.color+" "+this.name);
   }
}
