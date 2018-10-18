package com.MarekSchmidt;

//    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise return false.
//
//    EXAMPLES OF INPUT/OUTPUT:
//
//    areEqualByThreeDecimalPlaces(-3.1756, -3.175); should return true since numbers are equal up to 3 decimal places.
//    areEqualByThreeDecimalPlaces(3.175, 3.176); should return false since numbers are not equal up to 3 decimal places
//    areEqualByThreeDecimalPlaces(3.0, 3.0); should return true since numbers are equal up to 3 decimal places.


public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(0.0, 0.0));
        System.out.println(areEqualByThreeDecimalPlaces(0.000005, -0.0000006));
        System.out.println(areEqualByThreeDecimalPlaces(5.0, 8.0));
//        System.out.println(((float)(int)((1.23456789 * 100000)) / 100000));

    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
        return ( (int)(x * 1000) == (int)(y * 1000) );
    }
}
