package com.thoughtworks.tw101.exercises.exercise7;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by laurakingsley on 7/25/16.
 */
public class RandomNumberGenerator {
    private int number;
    private ArrayList<Integer> guessList;

    public RandomNumberGenerator() {

        number = getNewRandomNumber();
        guessList = new ArrayList<Integer>();
    }

    public int getNewRandomNumber() {
        Random rand = new Random();
        int randomInt = rand.nextInt((100 - 1) + 1) + 1;
        return randomInt;
    }

    public int guessNumber(int guess) {

        int compare = 0;
        if (guess > number) {
            compare = 1;
        }
        if (guess < number) {
            compare = -1;
        }
        return compare;
    }
}
