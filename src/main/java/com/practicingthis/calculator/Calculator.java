package com.practicingthis.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Addition newAdditionObject = new Addition();

        Substraction newSubstractionObject = new Substraction();

        Multiplication newMultiplicationObject = new Multiplication();

        System.out.println("Press 1 for addition, 2 for substraction, 3 for multiplication");
        double choice;
        Scanner getChoice = new Scanner(System.in);
        choice = getChoice.nextDouble();

        if(choice==1) {
            newAdditionObject.addTwoNumbers();
        }
        else  if (choice==2) {
            newSubstractionObject.substractTwoNumbers();
        }
        else newMultiplicationObject.multiplyTwoNumbers();

        System.out.println("Finished calculations!");

    }
}
