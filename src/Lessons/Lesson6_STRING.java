package Lessons;

import java.util.Scanner;

public class Lesson6_STRING {
    public static void main(String[] args) {
        //Check the length of a string (length without NULL)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String newString = input.nextLine();
        System.out.println("Length of this string is: " + newString.length());

        //Transform this string to upper
        System.out.println("Enter the string: ");
        String newString2 = input.nextLine();
        System.out.println("This string in upper: " + newString2.toUpperCase());

        //Replace all the " " by "*"
        System.out.println("Enter the string: ");
        String newString3 = input.nextLine();
        System.out.println("This string is replaced: " + newString3.replace(" ", "*"));


    }
}
