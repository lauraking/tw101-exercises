package com.thoughtworks.tw101.exercises.exercise8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RecordGame {

    private int currentGuess;
    private ArrayList<Integer> guessList;
    private RecordRandomNumberGenerator numberGenerator;

    public RecordGame(RecordRandomNumberGenerator gen) {
        numberGenerator = gen;
        guessList = new ArrayList<Integer>();
    }

    public void run() {
        boolean correctGuess = false;
        while (!correctGuess) {
            while (!getValidResponse()) {
            }
            correctGuess = evaluateGuess();
        }
        printGuesses();

    }

    public void printGuesses() {
        System.out.println("Guesses: ");
        for (int i = 0; i < guessList.size(); i++) {
            System.out.println(guessList.get(i));
        }
    }

    public boolean getValidResponse() {
        System.out.println("Guess and integer between 1 and 100 inclusive");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        int i;
        try {
            s = br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("INVALID INPUT");
            return false;
        }

        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException E) {
            System.out.println("INVALID GUESS: not valid integer");
            return false;
        }

        currentGuess = i;

        if (currentGuess > 100 || currentGuess < 1) {
            System.out.println("INVALID GUESS: out of bounds");
            return false;
        }
        guessList.add(currentGuess);

        return true;

    }

    public boolean evaluateGuess() {

        int evaluateInt = numberGenerator.guessNumber(currentGuess);

        if (evaluateInt == 0) {
            System.out.println("Correct! The number was: " + currentGuess);
            return true;
        } else if (evaluateInt == 1) {
            System.out.println("You guessed too high");
            return false;
        } else if (evaluateInt == -1) {
            System.out.println("You guessed too low");
            return false;
        }

        return false;
    }

    public boolean isValidInteger() {
        return true;
    }


}
