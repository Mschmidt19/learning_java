package com.MarekSchmidt;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Marek", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(84.5));
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(50));
        System.out.println(calcFeetAndInchesToCentimeters(10));
        System.out.println(calcFeetAndInchesToCentimeters(-5));
        System.out.println(calcFeetAndInchesToCentimeters(4, 26));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }


    // EXERCISE

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ( (feet < 0) || (inches < 0) || (inches > 12) ) {
            return -1;
        } else {
            double totalInches = (inches + (12 * feet));
            return (totalInches * 2.54);
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if ( inches < 0 ) {
            return -1;
        } else {
            double feet = (double)(int)(inches / 12);
            double remainingInches = (inches % 12);
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }




}
