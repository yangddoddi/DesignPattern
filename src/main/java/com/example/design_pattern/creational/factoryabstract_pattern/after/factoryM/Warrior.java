package com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM;

import com.example.design_pattern.creational.factoryabstract_pattern.after.Job;

public class Warrior extends CharacterV2 {
    private int HP;
    private int MP;

    public Warrior() {
        setHP(150);
        setMP(100);
        setJob(Job.WARRIOR);
    }

    @Override
    public void updateStats() {
        this.HP += 50;
        this.MP += 10;
    }
}
