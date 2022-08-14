package com.example.design_pattern.creational.factoryabstract_pattern.before;

import com.example.design_pattern.creational.factoryabstract_pattern.after.BasicWeapon;
import com.example.design_pattern.creational.factoryabstract_pattern.after.Job;
import com.example.design_pattern.creational.factoryabstract_pattern.after.BasicShield;
import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.HighEndShield;
import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.HighEndWeapon;
import lombok.Data;

@Data
public class Character {
    private String name;
    private Job job;
    private int HP;
    private int MP;
    private int exp;
    private int level;
    private BasicWeapon basicWeapon;
    private BasicShield basicShield;
    private HighEndWeapon highEndWeapon;
    private HighEndShield highEndShield;


    public Character(String name, Job job) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("유효하지 않은 이름");
        }
        if (job == Job.WARRIOR) {
            this.HP = 150;
            this.MP = 100;
        }
        if (job == Job.MAGICIAN) {
            this.HP = 100;
            this.MP = 150;
        }

        this.name = name;
        this.job = job;
        this.basicShield = basicShield;
        this.basicWeapon = basicWeapon;
    }

    public void checkExp() {
        if ( exp > (level * 10000)) {
            System.out.println("레벨 업까지 충분한 경험치가 모였습니다.");
        } else {
            System.out.println("현재 경험치는 " + exp + "이며 레벨업까지 필요한 경험치는 " + (level*10000-exp) + "입니다.");
        }
    }

    public void levelUp() {
        if (exp >= (level * 10000)) {
            if (this.job == Job.WARRIOR) {
                this.HP += 50;
                this.MP += 10;
            }

            if (this.job == Job.MAGICIAN) {
                this.HP += 10;
                this.MP += 50;
            }

            this.exp -= this.exp - (level*1000);
            this.level += 1;
        }

        if (exp <= (level * 10000)) {
            System.out.println("경험치가 충분하지 않습니다.");
        }
    }
}
