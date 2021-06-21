package com.bkuku;

public class TestValueMethod {

    public static void main(String[] args) {
        System.out.print("Grade is" + getGrade(78.5) );
        System.out.print("\nGrade is"+ getGrade(59.5) );
    }

    private static String getGrade(double scores) {
        if (scores >= 90)
            return "A";
        else if (scores>=80)
            return "B";
        else if (scores>= 70)
            return "c";
        else if (scores>=60)
            return  "D";
        else
            return "F";


    }
}
