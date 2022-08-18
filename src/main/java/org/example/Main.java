package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon bingus = new LaserCannon("dookie", 1500);
        Weapon lego = new DraugerBow("lil brick", 269);
        Robot robot_one = new Robot(bingus);
        Robot robot_two = new Robot(lego);
        robot_one.Attack();
        robot_two.Attack();
    }
}