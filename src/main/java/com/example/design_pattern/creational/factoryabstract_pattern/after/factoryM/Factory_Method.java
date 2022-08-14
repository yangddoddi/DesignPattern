package com.example.design_pattern.creational.factoryabstract_pattern.after.factoryM;

import com.example.design_pattern.creational.factoryabstract_pattern.after.abstractF.Equipment_Factory;

public interface Factory_Method {
    default CharacterV2 createOrder(String name, Equipment_Factory factory) {
        validate(name);
        CharacterV2 character = getCharacter();
        character.setName(name);
        character.setWeapon(factory.getWeapon());
        character.setShield(factory.getShield());
        return character;
    }

    default void validate(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("유효하지 않은 이름");
        }
    }

    CharacterV2 getCharacter();
}
