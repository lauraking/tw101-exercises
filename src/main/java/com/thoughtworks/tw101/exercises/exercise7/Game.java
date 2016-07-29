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

    }

    public void promptUser() {
        System.out.println("Guess and integer between 1 and 100 inclusive");

    }

    public boolean getValidResponse() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        int i;
        try {
            s = br.readLine();
        } catch (IOException e) {
            return false;
        }

        try {
            i = Integer.parseInt(s);
        }
            catch (NumberFormatException E) {
                return false;
        }
        currentGuess = i;
        return true;

    }

    public boolean evaluateGuess () {
        int evaluateInt = numberGenerator.guessNumber(currentGuess);
        if (evaluateInt == 0) {
            return true;
        }
        else if (evaluateInt == 1) {
            return false;
        }
        else if (evaluateInt == -1) {
            return false;
        }

        return false;
    }

    public boolean isValidInteger() {
        return true;
    }



}
