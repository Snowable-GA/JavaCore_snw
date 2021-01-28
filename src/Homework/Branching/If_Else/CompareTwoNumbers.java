package Homework.Branching.If_Else;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers form keyboard: ");
        int number1, number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();

        //Compare two numbers
        if(number1 > number2){
            System.out.println(number1 + " is bigger than " + number2);
        }
        else if(number1 < number2){
            System.out.println(number1 + " is smaller than " + number2);
        }
        else{
            System.out.println(number1 + " is equal " + number2);
        }
    }
}
