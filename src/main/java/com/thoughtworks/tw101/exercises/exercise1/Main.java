package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;
        for (counter = 1; counter <= 100; counter += 2) {
            System.out.println(counter);
            sum += counter;
        }
        System.out.println("Sum: "+sum);

    }
}
