package com.bridgelabz;

import java.util.Scanner;

public class Algo_10_FindNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENter a number");
        int n = scanner.nextInt();
        int low = 0, high = n - 1;
        int guess = 0, numGuesses = 0;

        System.out.print("Think of a number between 0 and " + (n - 1) + ".\n");
        while (low <= high) {
            guess = (low + high) / 2;
            System.out.print("Is your number between " + low + " and " + guess + "? ");
            String str = scanner.next();
            numGuesses++;

            if (str.equals("y")) {
                high = guess - 1;
            } else {
                    low = guess + 1;
            }
        }
        System.out.println("Your number is " + guess + ".");
        System.out.println("Number of guesses: " + numGuesses);
    }
}