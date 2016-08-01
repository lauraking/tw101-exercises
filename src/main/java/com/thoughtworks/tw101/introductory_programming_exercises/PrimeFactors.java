package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        for (Integer num: primeFactors) System.out.println(num);
    }

    // this function returns a list of the prime factors of an integer from smallest to largest
    // begin with 2, then add 2 to the factor list for every time the input is divisible by 2
    // once the number is not divisible by 2 anymore, increment i and repeat
    private static List<Integer> generate(int n) {
        List factorList = new ArrayList<Integer>();
        int remainder = n;
        for (int i = 2; i <= n; i++) {
            while (remainder%i == 0) {
                factorList.add(i);
                remainder = remainder/i;
            }
        }
        return factorList;

    }
}
