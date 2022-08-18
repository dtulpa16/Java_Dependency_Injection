package org.example;

import java.util.Scanner;

public class Robot {

    public String name;
    public Weapon weapon;

    public Robot(Weapon weapon) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Robot Name");
        this.name = sc.nextLine();
        this.weapon = weapon;
    }

    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }
}
