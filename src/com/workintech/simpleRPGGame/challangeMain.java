package com.workintech.simpleRPGGame;

public class challangeMain {
    public static void main(String[] args) {
        Monster lordYarkan = new LordYarkan("Lord Yarkan",30,21);
        Monster tigerGirl = new TigerGirl("Tiger Girl", 21,21);
        Monster uruchi = new Uruchi("Uruchi",21,32);
        System.out.println(lordYarkan.getName()+ " vs " +tigerGirl.getName());
        System.out.println(lordYarkan.getName()+" attacked to " + tigerGirl.getName() + " by "+lordYarkan.attack());

    }
}
