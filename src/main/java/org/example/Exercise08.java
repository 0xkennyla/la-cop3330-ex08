/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;

public class Exercise08 {
    public static void main (String []args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many people?");
        int people = scan.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizza = scan.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = scan.nextInt();
        int totalSlices = slices*pizza;
        System.out.println(people + " people with " + pizza + " pizzas (" + totalSlices + " slices)");
        int amount = totalSlices/people;
        System.out.println("Each person gets " + amount + " pieces of pizza.");
        int leftover = totalSlices%people;
        System.out.println("There are " + leftover + " leftover pieces.");
    }
}
