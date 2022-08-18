package org.example;

public class DragonBorn implements Attacker{
    public String name;
    public int attackPower;

    public DragonBorn(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    @Override
    public void Attack() {
        System.out.println(this.name + " attacked and dealt " + this.attackPower + " damage");
    }
}
