package com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM;

import com.example.design_pattern.creational.factoryabstract_pattern.after.BasicShield;
import com.example.design_pattern.creational.factoryabstract_pattern.after.BasicWeapon;
import com.example.design_pattern.creational.factoryabstract_pattern.after.Job;
import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.Equipment_Factory;
import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.Shield;
import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.Weapon;
import lombok.Data;

@Data
public abstract class CharacterV2 {
    private String name;
    private Job job;
    private int HP;
    private int MP;
    private int exp;
    private int level;
    private Weapon weapon;
    private Shield shield;

    public void checkExp() {
        if ( exp > (level * 10000)) {
            System.out.println("레벨 업까지 충분한 경험치가 모였습니다.");
        } else {
            System.out.println("현재 경험치는 " + exp + "이며 레벨업까지 필요한 경험치는 " + (level*10000-exp) + "입니다.");
        }
    }

    public void levelUp() {
        if (exp >= (level * 10000)) {
            updateStats();
        }

        if (exp <= (level * 10000)) {
            System.out.println("경험치가 충분하지 않습니다.");
        }
    }

    public abstract void updateStats();
}
