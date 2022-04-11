package com.bridgelabz;

public class PracticeProblem {
    public static void main(String[] args) {
        String string1 = "Hello World";
        String string2 = "Hello World";
        String string3 = "Hello Java ";
        System.out.println("string 1 = " + string1 + " \nstring 2 = " + string2 + " \nstring 3 = " + string3);
        boolean retval1 = string2.equals(string1);
        boolean retval2 = string2.equals(string3);
        System.out.println("string 2 is equal to string 1 = " + retval1);
        System.out.println("string 2 is equal to string 3 = " + retval2);
    }
}