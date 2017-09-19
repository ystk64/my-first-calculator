package com.practicingthis.calculator;

import java.util.Scanner;

public class Multiplication {
    public void multiplyTwoNumbers() {
        Scanner getInput = new Scanner(System.in); // Initialise scanner so we can scan for user input

        double firstNum, secondNum, answer;

        System.out.println("Enter first number: ");
        firstNum = getInput.nextDouble(); // scan for a double to get first number
        System.out.println("Enter second number: ");
        secondNum = getInput.nextDouble(); // scan for a double to get second number
        answer = firstNum * secondNum; // multiply the two numbers
        System.out.println("The answer is " + answer + ".");
    }
}
