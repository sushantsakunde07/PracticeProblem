package com.bridgelabz;

public class PracticeProblem {
    static int staticElement = 10;

    static {
        System.out.println("Static block");
    }

    public static void main(String args[]) {
        System.out.println("Main method");
        System.out.println("Static integer : " + staticElement);
        student s1 = new student();
        s1.write();

    }
}