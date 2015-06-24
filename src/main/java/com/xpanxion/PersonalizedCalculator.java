package com.xpanxion;

import java.util.Scanner;

/**
 * Created by cdorsey on 6/24/2015.
 */
public class PersonalizedCalculator {
    public static void main(String[] args) {
        System.out.println("** Welcome to the Personalized Calculator **");
        System.out.println("");
        System.out.println("What is your name?");

        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.next();
        System.out.println("Hi, " + name);
    }
}
