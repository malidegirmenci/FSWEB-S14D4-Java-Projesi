package com.workintech.simpleRPGGame;

public class LordYarkan extends Monster implements Bleedable{
    public LordYarkan(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * 0.5;
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }
}
