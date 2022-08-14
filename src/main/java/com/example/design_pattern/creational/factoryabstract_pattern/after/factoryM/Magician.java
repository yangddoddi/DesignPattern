package com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM;

import com.example.design_pattern.creational.factoryabstract_pattern.after.Job;

public class Magician extends CharacterV2 {
    private int HP;
    private int MP;

    public Magician() {
        setHP(100);
        setMP(150);
        setJob(Job.MAGICIAN);
    }

    @Override
    public void updateStats() {
        this.HP += 10;
        this.MP += 50;
    }
}
