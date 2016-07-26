package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by laurakingsley on 7/25/16.
 */
public class Orc implements Monster {
    public int hitPoints;
    public String name;

    public Orc () {
        hitPoints = 20;
        name = "Orc";
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;

    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": "+hitPoints);

    }
}
