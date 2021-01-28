package Homework.Branching.If_Else;

import java.util.Scanner;

public class CheckCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();

        //Check character
        if (myString.charAt(0) == myString.charAt(myString.length() - 1)) {
            System.out.println("Matched!");
        }
        else System.out.println("Unmatched.");
    }
 }
