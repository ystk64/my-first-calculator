package com.practicingthis.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Addition newAdditionObject = new Addition();

        Substraction newSubstractionObject = new Substraction();

        Multiplication newMultiplicationObject = new Multiplication();

        Division newDivisionObject = new Division();

        System.out.println("Press 1 for addition, 2 for substraction, 3 for multiplication, 4 for division");
        String choice1;
        Scanner getChoice = new Scanner(System.in);
        choice1 = getChoice.next();

        switch (choice1) {

            case "1":
                newAdditionObject.addTwoNumbers();
                break;

            case "2":
                newSubstractionObject.substractTwoNumbers();
                break;

            case "3":
                newMultiplicationObject.multiplyTwoNumbers();
                break;

            case "4":
                newDivisionObject.divideTwoNumbers();
                break;
        }
    }
}
