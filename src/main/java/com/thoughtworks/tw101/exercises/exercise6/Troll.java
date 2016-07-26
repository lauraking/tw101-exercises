package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by laurakingsley on 7/25/16.
 */
public class Troll implements Monster{
    public int hitPoints;
    public String name;

    public Troll () {
        hitPoints = 40;
        name = "Troll";
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount/2;

    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": "+hitPoints);

    }
}
