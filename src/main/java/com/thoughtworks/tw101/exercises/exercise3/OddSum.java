package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {

        int sum = 0;

        if (isEven(start)) {
            start++;
        }

        for (int curVal = start; curVal <= end; curVal+=2) {
            sum += curVal;
        }
        return sum;
    }

    public boolean isEven (int testInt) {
       return testInt%2==0;
    }
}
