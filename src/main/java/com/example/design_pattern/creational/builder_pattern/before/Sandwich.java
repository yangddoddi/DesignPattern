package com.example.design_pattern.creational.builder_pattern.before;

import com.example.design_pattern.creational.builder_pattern.before.Sandwich.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class Sandwich {
    private String bread;
    private String lettuce;
    private String ham;
    private String jam;
    private String egg;
    private String chickenTender;
    private String cheese;
    private String avocado;
    private String tomato;

    public Sandwich(Builder builder) {
        this.bread = builder.bread;
        this.lettuce = builder.lettuce;
        this.ham = builder.ham;
        this.jam = builder.jam;
        this.egg = builder.egg;
        this.chickenTender = builder.chickenTender;
        this.cheese = builder.cheese;
        this.avocado = builder.avocado;
        this.tomato = builder.tomato;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (bread != null) sb.append(bread).append(" ");
        if (lettuce != null) sb.append(lettuce).append(" ");
        if (ham != null) sb.append(ham).append(" ");
        if (jam != null) sb.append(jam).append(" ");
        if (egg != null) sb.append(egg).append(" ");
        if (chickenTender != null) sb.append(chickenTender).append(" ");
        if (cheese != null) sb.append(cheese).append(" ");
        if (avocado != null) sb.append(avocado).append(" ");
        if (tomato != null) sb.append(tomato).append(" ");

        return sb.toString();
    }


    public static class Builder {
        private String bread;
        private String lettuce;
        private String ham;
        private String jam;
        private String egg;
        private String chickenTender;
        private String cheese;
        private String avocado;
        private String tomato;

        public Builder() {
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder lettuce(String lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder ham(String ham) {
            this.ham = ham;
            return this;
        }

        public Builder jam(String jam) {
            this.jam = jam;
            return this;
        }

        public Builder egg(String egg) {
            this.egg = egg;
            return this;
        }

        public Builder chickenTender(String chickenTender) {
            this.egg = egg;
            return this;
        }

        public Builder cheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder avocado(String avocado) {
            this.avocado = avocado;
            return this;
        }

        public Builder tomato(String tomato) {
            this.tomato = tomato;
            return this;
        }

        public Sandwich getSandwich() {
            if (bread == null) throw new IllegalArgumentException("빵이 있어야 샌드위치죠..");
            return new Sandwich(bread, lettuce, ham, jam, egg, chickenTender, cheese, avocado, tomato);
        }
    }
}