package com.MarekSchmidt;

public class Main {

//    We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//
//    Write a method hasTeen with 3 parameters of type int.
//
//    The method should return boolean and it needs to return true if one of parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
//
//    EXAMPLES OF INPUT/OUTPUT:
//
//    hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//    hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//    hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19)); // true
        System.out.println(hasTeen(23,15,42)); // true
        System.out.println(hasTeen(22,23,34)); // false
    }

    public static boolean hasTeen(int first, int second, int third) {
        int[] arguments = {first, second, third};
        for (int i : arguments) {
            if ( (i >= 13) && (i <= 19) ) {
                return true;
            }
        }
        return false;
    }
}
