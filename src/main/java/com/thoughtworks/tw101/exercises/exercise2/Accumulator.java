package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int incrementCallNumber;

    public Accumulator() {
        incrementCallNumber = 0;
    }

    public void increment() {
        this.incrementCallNumber++;
    }

    public void total() {
        System.out.println("Number of Increment Calls: "+ this.incrementCallNumber);
    }
}
