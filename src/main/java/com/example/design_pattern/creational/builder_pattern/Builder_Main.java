package com.example.design_pattern.creational.builder_pattern;

import com.example.design_pattern.creational.builder_pattern.after.CustomSandwichBuilder;
import com.example.design_pattern.creational.builder_pattern.after.ReadyMadeSandwich;
import com.example.design_pattern.creational.builder_pattern.after.SandiwichAnno;
import com.example.design_pattern.creational.builder_pattern.after.SandwichBuilder;
import com.example.design_pattern.creational.builder_pattern.before.Sandwich;

public class Builder_Main {
    public static void main(String[] args) {
        Sandwich tenderSandwich =
                new Sandwich("식빵","양상추",null,"칠리소스","계란","텐더","치즈",null,null);

        SandwichBuilder sandwichBuilder = new CustomSandwichBuilder();
        Sandwich hamCheeseSandwich = sandwichBuilder.bread("호밀빵")
                .jam("딸기잼")
                .lettuce("양상추")
                .ham("슬라이스햄")
                .cheese("치즈")
                .getSandwich();

        ReadyMadeSandwich readyMadeSandwich = new ReadyMadeSandwich(new CustomSandwichBuilder());
        Sandwich tenderSandwich2 = readyMadeSandwich.getChickenTenderSandwich();

        Sandwich 이름짓기귀찮은샌드위치 = new Sandwich.Builder()
                .bread("빵빵")
                .avocado("애보케도")
                .chickenTender("췩췩퉨더")
                .jam("딸기쫨")
                .tomato("도메이로")
                .getSandwich();

        SandiwichAnno 더쉽게만든샌드위치 = SandiwichAnno.builder()
                .lettuce("에그머니나")
                .ham("으헴헴")
                .build();

        System.out.println(tenderSandwich);
        System.out.println(hamCheeseSandwich);
        System.out.println(tenderSandwich2);
        System.out.println(이름짓기귀찮은샌드위치);
    }
}
