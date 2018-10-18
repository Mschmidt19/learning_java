package com.MarekSchmidt;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        // ++, --, +=, -=, *=, /=,  etc

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        else
            System.out.println("It is an alien!");

        isAlien = true;
        if (isAlien == false)
            System.out.println("It is not an alien!");
        else
            System.out.println("It is an alien!");

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        // &&, ||

        boolean isCar = false;

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");
        else
            System.out.println("wasCar is false");


        double myDouble = 20;
        double mySecondDouble = 80;
        double myResult = (myDouble + mySecondDouble) * 25;
        double remainder = myResult % 40;
        if (remainder <= 20)
            System.out.println("Total was over the limit");

    }
}
