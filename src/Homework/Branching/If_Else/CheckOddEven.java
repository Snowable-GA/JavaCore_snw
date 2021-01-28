package Homework.Branching.If_Else;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        //Check this number is odd or even
        if(number % 2 == 0){
            System.out.println("This number is even.");
        }
        else{
            System.out.println("This number is odd.");
        }
    }
}
