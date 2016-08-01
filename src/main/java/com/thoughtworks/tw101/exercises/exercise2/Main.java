package com.thoughtworks.tw101.exercises.exercise2;

// Exercise #2: Create a class that counts how many times you call the method increment() and prints out that number
// when you call total(). Create a main method that calls increment() 5 times and then calls total().

public class Main {
    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator(); // create new accumululator object
        for (int loopCount = 1; loopCount <= 5; loopCount++) { // call increment 5 times on accumulator
            accumulator.increment();
        }
        accumulator.total(); // get total value from accumulator
    }
}
