package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        int sum = 0;

        if (isEven(start)) { // if the initial number is even, incremement so starting number is odd
            start++;
        }

        // starting with the first odd number add to sum and then increment by 2 until reach the ending number
        for (int curVal = start; curVal <= end; curVal+=2) {
            sum += curVal;
        }
        return sum;
    }

    public boolean isEven (int testInt) {
       return testInt%2==0;
    }
}
