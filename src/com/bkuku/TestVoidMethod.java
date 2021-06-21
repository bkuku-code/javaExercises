package com.bkuku;

public class TestVoidMethod {

    private static int scores;

    public static void main(String[] args) {

        System.out.println("Grade is ");
        printGrade(78.5);

        System.out.println("Grade is ");
        printGrade(59.9);
    }

    private static void printGrade(double scores) {
        if (scores >= 90.0) {
            System.out.println("A");
        } else if (scores >= 80) {
            System.out.println("B");
        } else if (scores >= 70) {
            System.out.println("C");
        } else if (scores >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");

        }
    }
}