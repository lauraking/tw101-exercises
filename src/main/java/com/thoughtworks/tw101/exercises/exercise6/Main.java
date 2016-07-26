package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

// todo ??? each monster takes 10 points of damage? so hit trolls with 20?
public class Main {
    public static void main(String[] args) {
        Orc orc_one = new Orc();
        Orc orc_two = new Orc();
        Orc orc_three = new Orc();
        Orc orc_four = new Orc();
        Troll troll_one = new Troll();
        Troll troll_two = new Troll();

        ArrayList<Monster> monsterArrayList = new ArrayList<Monster>();
        monsterArrayList.add(orc_one);
        monsterArrayList.add(orc_two);
        monsterArrayList.add(orc_three);
        monsterArrayList.add(orc_four);
        monsterArrayList.add(troll_one);
        monsterArrayList.add(troll_two);

        for (Monster monster: monsterArrayList) {
            monster.takeDamage(10);
        }

        for (Monster monster: monsterArrayList) {
            monster.reportStatus();
        }


    }
}
