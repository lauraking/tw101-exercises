package com.thoughtworks.tw101.exercises.exercise7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by laurakingsley on 7/27/16.
 */
public class Game {

    private int currentGuess;
    private RandomNumberGenerator numberGenerator;
    public Game (RandomNumberGenerator gen) {
        numberGenerator = gen;
    }

    public void run() {
        boolean correctGuess = false;
        while(!correctGuess) {
            while (!getValidResponse()) {
            }
            correctGuess = evaluateGuess();
        }
    }

    public void promptUser() {


    }

    public boolean getValidResponse() {
        System.out.println("Guess and integer between 1 and 100 inclusive");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        int i;
        try {
            s = br.readLine();
            System.out.println("guess: "+s);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("INVALID GUESS: not valid integer");
            return false;
        }

        try {
            i = Integer.parseInt(s);
        }
            catch (NumberFormatException E) {
                E.printStackTrace();
                //System.out.println("guess: "+i);
                System.out.println("INVALID GUESS: not valid integer");
                return false;
        }
        currentGuess = i;
        if (currentGuess > 100 || currentGuess < 1) {
            System.out.println("INVALID GUESS: out of bounds");
            return false;
        }


        return true;

    }

    public boolean evaluateGuess () {
        int evaluateInt = numberGenerator.guessNumber(currentGuess);
        if (evaluateInt == 0) {
            System.out.println("Correct! The number was: "+currentGuess);
            return true;
        }
        else if (evaluateInt == 1) {
            System.out.println("You guessed too high");
            return false;
        }
        else if (evaluateInt == -1) {
            System.out.println("You guessed too low");
            return false;
        }

        return false;
    }

    public boolean isValidInteger() {
        return true;
    }



}
