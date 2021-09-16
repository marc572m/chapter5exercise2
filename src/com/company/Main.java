package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void answer (int a, int b){
        if (a < b){
            System.out.println("The answer is lower");
        } else if (a > b){
            System.out.println("The answer is higer");
        }else {
            System.out.println("You guessed the number!");
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rdm = new Random();
        int number = rdm.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1-100 (including both)" +
                "\nCan you guess what it is? \nEnter a number:");
        try {
            //first guess
            int guess = in.nextInt();
            System.out.println("Your guess is: " + guess);
            answer(number, guess);

            //another try
            System.out.println("Try again");
            int guess2 = in.nextInt();
            answer(number, guess2);

            //last try + answer in the end
            System.out.println("Last try");
            int guess3 = in.nextInt();
            answer(number, guess3);
            System.out.println("Bad luck the answer is: " + number);
        }
        catch (Exception e){
            System.err.println("Needs to be a number!");
        }

    }
}
