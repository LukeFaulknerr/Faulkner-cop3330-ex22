/*
    UCF COP3330 Fall 2021 Assignment 22 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        int num1, num2, num3, highestNum;
        Scanner numReader= new Scanner(System.in);

        // Prompt
        System.out.print("Enter the first number: ");
        num1 = numReader.nextInt();
        System.out.print("Enter the second number: ");
        num2 = numReader.nextInt();
        System.out.print("Enter the third number: ");
        num3 = numReader.nextInt();

        // check difference
        if (num1 == num2 || num1 == num3 || num2 == num3){
            return;
        }
        // comparisons
        if (num1 >= num2)
            highestNum = num1;
        else
            highestNum = num2;

        if(highestNum < num3)
            highestNum = num3;

        // Result
        System.out.print("The highest number is " + highestNum);
    }
}
