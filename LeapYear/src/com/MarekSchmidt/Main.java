package com.MarekSchmidt;

//    Write a method isLeapYear with a parameter of type int named year.
//
//    The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//
//    If the parameter is not in that range return false.
//
//    Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
//
//    A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
//
//    Examples of input/output:
//
//    isLeapYear(-1600); should return false since parameter is not in the range (1-9999)
//    isLeapYear(1600); should return true since 1600 is leap year
//    isLeapYear(2017); should return false since 2017 is not a leap year
//    isLeapYear(2000); should return true because 2000 is a leap year

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 400 == 0){
            return true;
        } else {
            return (year % 4 == 0 && year % 100 != 0);
        }
    }
}
