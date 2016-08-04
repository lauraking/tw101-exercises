package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        RecordRandomNumberGenerator randomNumGen = new RecordRandomNumberGenerator();
        RecordGame game = new RecordGame(randomNumGen,System.out);
        try {
            game.run();
        }
        catch (IOException e) {
            System.err.println("Exception caught: "+e);
            System.exit(-1);
        }

    }
}
