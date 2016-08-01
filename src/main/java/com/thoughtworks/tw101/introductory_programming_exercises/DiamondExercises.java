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
        drawTriangle(true,n,0,n);

    }

    // this function draws a triangle with the following specifications
    // if rightSideUp is true, the triangle is point up
    // the start and end values are determined by what rows of the full triangle are drawn
    private static void drawTriangle(boolean rightSideUp, int n, int start, int end) {

        if (rightSideUp) {
            for (int row = start; row < end; row++) {

                evaluateRow(row, n);

                System.out.print("\n");

            }
        }
        else {
            for (int row = end - 1; row >= start; row--) {

                evaluateRow(row, n);

                System.out.print("\n");

            }
        }
    }

    // This method determines which characters of a given row should be blank or stars and prints to the console
    private static void evaluateRow(int row, int n) {
        int length = 2 * n - 1;
        int mid = n - 1;
        for (int i = 0; i < length; i++) {
            if ((i > mid + row) || (i < mid - row)) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
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
        drawTriangle(false,n,0,n - 1);

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *


    private static void drawADiamondWithYourName(int n) {
        drawTriangle(true,n,0,n-1);

        System.out.println("Laura");

        drawTriangle(false,n,0,n-1);

    }

}
