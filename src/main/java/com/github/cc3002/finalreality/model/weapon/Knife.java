package com.github.cc3002.finalreality.model.weapon;

public class Knife extends AbstractNormalWeapon {
    public Knife(String name, int weight, int damage) {
        super(name, weight, damage);
    }

    @Override
    protected int getDamage() {
        return this.damage;
    }

    @Override
    public String getType() {
        return "Knife";
    }
}
