package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import com.sun.javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        for (Integer num : primeFactors) System.out.println(num);

        List<Integer> primeFactorsRecursive = generateRecursive(30);
        for (Integer num : primeFactorsRecursive) System.out.println(num);
    }

    // this function returns a list of the prime factors of an integer from smallest to largest
    // begin with 2, then add 2 to the factor list for every time the input is divisible by 2
    // once the number is not divisible by 2 anymore, increment i and repeat
    private static List<Integer> generate(int n) {
        List factorList = new ArrayList<Integer>();
        int remainder = n;
        for (int i = 2; i <= n; i++) {
            while (remainder % i == 0) {
                factorList.add(i);
                remainder = remainder / i;
            }
        }
        return factorList;

    }

    private static List<Integer> generateRecursive(int n) {
        List<Integer> factorList = generateRecursive(n, 2);
        return factorList;

    }

    private static List<Integer> generateRecursive(int n, int factor) {
        List<Integer> factorList = new ArrayList<Integer>();
        if (n == 1) {
            return factorList;
        }
        if (n % factor == 0) {
            factorList.add(factor);
            List<Integer> remainderList = generateRecursive(n / factor, factor);
            factorList.addAll(remainderList);
            return factorList;
        } else {
            factor++;
            List<Integer> nextList = generateRecursive(n, factor);
            return nextList;
        }


    }



}
