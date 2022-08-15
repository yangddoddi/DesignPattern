package com.example.design_pattern.creational.builder_pattern.after;

import com.example.design_pattern.creational.builder_pattern.before.Sandwich;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ReadyMadeSandwich {
    private final SandwichBuilder sandwichBuilder;

    public Sandwich getHamCheeseSandwich() {
        return sandwichBuilder.bread("호밀빵")
                .jam("딸기잼")
                .lettuce("양상추")
                .ham("슬라이스햄")
                .cheese("치즈")
                .tomato("도뭬이로")
                .getSandwich();
    }

    public Sandwich getChickenTenderSandwich() {
        return sandwichBuilder.bread("플레인식빵")
                .jam("칠리소스")
                .lettuce("양상추")
                .cheese("체다치즈")
                .tomato("도메이도")
                .getSandwich();
    }
}
