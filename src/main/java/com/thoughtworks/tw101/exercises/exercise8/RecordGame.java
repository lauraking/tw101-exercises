package com.thoughtworks.tw101.exercises.exercise8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class RecordGame {

    private int currentGuess;
    private ArrayList<Integer> guessList;
    private RecordRandomNumberGenerator numberGenerator;
    private PrintStream printStream;

    public RecordGame(RecordRandomNumberGenerator gen, PrintStream printStream) {
        numberGenerator = gen;
        this.printStream = printStream;
        guessList = new ArrayList<Integer>();
    }

    public void run() throws IOException{
        boolean correctGuess = false;
        while (!correctGuess) {
            while (!getIntegerResponse()) {
            }
            correctGuess = evaluateGuess();
        }
        printGuesses();

    }

    private boolean getIntegerResponse() throws IOException {
        print("Guess and integer between 1 and 100 inclusive");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        try {
            currentGuess = Integer.parseInt(s);
        } catch (NumberFormatException E) {
            print("INVALID GUESS: not valid integer");
            return false;
        }

        guessList.add(currentGuess);

        return true;

    }

    private boolean guessOutOfBounds(int response) {
        if (response > 100 || response < 1) {
            print("INVALID GUESS: out of bounds");
            return true;
        }
        return false;
    }

    private boolean evaluateGuess() {

        if (guessOutOfBounds(currentGuess)) return false;

        int evaluateInt = numberGenerator.guessNumber(currentGuess);

        if (evaluateInt == 0) {
            print("Correct! The number was: " + currentGuess);
            return true;
        } else if (evaluateInt == 1) {
            print("You guessed too high");
            return false;
        } else if (evaluateInt == -1) {
            print("You guessed too low");
            return false;
        }

        return false;
    }

    private void print(String string) {
        printStream.println(string);
    }

    private void printGuesses() {
        print("Guesses: ");
        for (int i = 0; i < guessList.size(); i++) {
            print(guessList.get(i).toString());
        }
    }

}
