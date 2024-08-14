package org.example;
public class Warmup1 {

    // Exercise 1: Determines if we can sleep in based on whether it's a weekday or we're on vacation
    public boolean sleepIn(boolean weekday, boolean vacation) {
        // If it's not a weekday, or we're on vacation, we can sleep in
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
        // Note: This could also be written as simply "return !weekday || vacation;"
    }

    // Exercise 2: Checks if a number is within 10 of 100 or 200
    public boolean nearHundred(int n) {
        // Return true if the absolute difference between n and 100 or 200 is 10 or less
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    // Exercise 3: Determines if the monkeys are in trouble based on their smiling status
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // We're in trouble if both monkeys are smiling or neither is smiling
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // This could also be simplified as:
        // return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or even shorter:
        // return (aSmile == bSmile);
    }

    // Exercise 4: Returns the sum of two numbers, or double the sum if the numbers are the same
    public int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double the sum if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        // Return the final sum
        return sum;
    }

    // Exercise 5: Returns the absolute difference between n and 21, or double the difference if n is greater than 21
    public int diff21(int n) {
        // If n is 21 or less, return the difference between 21 and n
        if (n <= 21) {
            return 21 - n;
        } else {
            // If n is greater than 21, return double the difference
            return (n - 21) * 2;
        }
    }

    public static void main(String[] args) {
        Warmup1 warmup1 = new Warmup1();

        // Test the sleepIn method
        System.out.println("sleepIn(false, false): " + warmup1.sleepIn(false, false));
        System.out.println("sleepIn(true, false): " + warmup1.sleepIn(true, false));
        System.out.println("sleepIn(false, true): " + warmup1.sleepIn(false, true));

        // Test the nearHundred method
        System.out.println("nearHundred(93): " + warmup1.nearHundred(93));
        System.out.println("nearHundred(90): " + warmup1.nearHundred(90));
        System.out.println("nearHundred(89): " + warmup1.nearHundred(89));
        System.out.println("nearHundred(200): " + warmup1.nearHundred(200));
        System.out.println("nearHundred(210): " + warmup1.nearHundred(210));

        // Test the monkeyTrouble method
        System.out.println("monkeyTrouble(true, true): " + warmup1.monkeyTrouble(true, true));
        System.out.println("monkeyTrouble(false, false): " + warmup1.monkeyTrouble(false, false));
        System.out.println("monkeyTrouble(true, false): " + warmup1.monkeyTrouble(true, false));

        // Test the sumDouble method
        System.out.println("sumDouble(1, 2): " + warmup1.sumDouble(1, 2));
        System.out.println("sumDouble(2, 3): " + warmup1.sumDouble(2, 3));
        System.out.println("sumDouble(4, 4): " + warmup1.sumDouble(4, 4));

        // Test the diff21 method
        System.out.println("diff21(19): " + warmup1.diff21(19));
        System.out.println("diff21(21): " + warmup1.diff21(21));
        System.out.println("diff21(25): " + warmup1.diff21(25));

    }
}



