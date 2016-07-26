package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by laurakingsley on 7/25/16.
 */
public class RandomNumberGenerator {
    public int number;

    public RandomNumberGenerator() {
       // todo number = Math.;
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
