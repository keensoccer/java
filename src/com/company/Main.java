package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        userInput = userInput * userInput;

	    System.out.println("Your number squared is " + userInput);


    }

}
