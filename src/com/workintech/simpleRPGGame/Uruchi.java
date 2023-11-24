package com.workintech.simpleRPGGame;

public class Uruchi extends Monster implements Bleedable{
    public Uruchi(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
}
