package com.workintech.simpleRPGGame;

public class TigerGirl extends Monster implements Poisonable, Bleedable {
    public TigerGirl(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);

    }
    @Override
    public double attack() {
        return getDamage() + bleed() + poison();
    }
    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
