package com.bridgelabz;

public class PracticeProblem {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        System.out.println("Calculating Sum of command line Args Integers ");
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException a) {
                count++;
            }
        }
        System.out.println("Sum of integers : " + sum);
        System.out.println("Count of non integers : " + count);
    }
}