package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon laser = new LaserCannon("laser", 1500);
        Attacker robot_one = new Robot(laser);
        robot_one.Attack();

        Attacker dragonBorn = new DragonBorn("Nord",150);
        dragonBorn.Attack();
    }
}