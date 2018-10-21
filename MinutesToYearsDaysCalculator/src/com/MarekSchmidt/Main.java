package com.MarekSchmidt;

public class Main {

//    Write a method printYearsAndDays with parameter of type long named minutes.
//
//    The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
//
//    If parameter is less than 0, print text "Invalid Value".
//
//    Otherwise if parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
//
//    XX represents the original value minutes. YY represents the calculated years. ZZ represents the calculated days.
//
//    EXAMPLES OF INPUT/OUTPUT:
//
//    printYearsAndDays(525600); should print "525600 min = 1 y and 0 d"
//    printYearsAndDays(1051200); should print "1051200 min = 2 y and 0 d"
//    printYearsAndDays(561600); should print "561600 min = 1 y and 25 d"
//
//    TIPS:
//
//    Be extra careful about spaces in the printed message.
//    Use the remainder operator
//    hour = 60 minutes
//    1 day = 24 hours
//    1 year = 365 days


    public static void main(String[] args) {
        printYearsAndDays(525600); // should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); // should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600); // should print "561600 min = 1 y and 25 d"
        printYearsAndDays(-60);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mToY = (60 * 24 * 365);
            int mToD = (60 * 24);
            String output = String.format("%d min = %d y and %d d", minutes, minutes / mToY, (minutes / mToD) % 365);
            System.out.println(output);
        }
    }
}
