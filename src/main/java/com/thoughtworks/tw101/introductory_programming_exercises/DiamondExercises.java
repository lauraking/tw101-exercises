package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        // 1 3 5 7
        int length = 2*n - 1;
        int mid = n-1;
        for (int row = 0; row < n; row ++) {
            int rowNum = 2*row - 1;
            for (int i = 0; i < length; i++) {
                if ((i > mid + row) || (i < mid - row)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");

        }

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawLowerDiamond(n);

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *

    private static void drawLowerDiamond(int n) {
        int length = 2*n - 1;
        int mid = n-1;

        for (int row = n - 2; row >= 0; row --) {
            int rowNum = 2*row - 1;
            for (int i = 0; i < length; i++) {
                if ((i > mid + row) || (i < mid - row)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");

        }
    }

    private static void drawADiamondWithYourName(int n) {
        int length = 2*n - 1;
        int mid = n-1;
        for (int row = 0; row < n-1; row ++) {
            int rowNum = 2*row - 1;
            for (int i = 0; i < length; i++) {
                if ((i > mid + row) || (i < mid - row)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");

        }
        System.out.println("Laura");

        drawLowerDiamond(n);

    }
}
