/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Zommer
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = scan.nextLine();
        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = scan.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = scan.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");

    }
}
/*
    Psuedo Code

    System.out prompt for 'noun'
    System.in for 'noun'
    System.out prompt for 'verb'
    System.in for 'verb'
    System.out prompt for 'adjective'
    System.in for 'adjective'
    System.out prompt for 'adverb'
    System.in for 'adverb'
    System.out with +
*/