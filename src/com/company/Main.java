package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many sides does the die have?");
        int sides = input.nextInt();

        System.out.println("How many times would you like to throw the dice?");
        int numThrows = input.nextInt();

        HashMap<Integer, Integer> sideTally = new HashMap<Integer, Integer>();
        for (int i = 1; i < sides + 1; i++) {
            sideTally.put(i, 0);
        }

        for (int i = 0; i < numThrows; i++) {
            int rand = random.nextInt(sides) + 1;
            System.out.println(rand);

            sideTally.putIfAbsent(rand, 0);
            sideTally.put(rand, sideTally.get(rand) + 1);
        }

        for (int key : sideTally.keySet()) {
            if (sideTally.get(key) == 1) {
                System.out.println("The die landed on " + key + " 1 time.");
            }
            else {
                System.out.println("The die landed on " + key + " " + sideTally.get(key) + " times.");
            }

        }
    }
}