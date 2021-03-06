package com.MarekSchmidt;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32_767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;

        //converts each to int and long accepts an int
        byte aByte = 40;
        short aShort = 28_000;
        int anInt = 2_000_000;
        long aLong = 50_000 + 10 * (aByte + aShort + anInt);
        System.out.println(aLong);
    }
}
