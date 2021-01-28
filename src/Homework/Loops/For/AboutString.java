package Homework.Loops.For;

import java.util.Scanner;

public class AboutString {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String myString = input.nextLine();

        System.out.printf(myString.charAt(0) + "");
        for (int i = 1; i < myString.length(); i++) {
           if(myString.charAt(i) == ' ' || myString.charAt(i-1)!= ' ')
                continue;
            System.out.printf(myString.charAt(i) + "");
        }

        System.out.println();
        var count = 1;
        for (int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i) == ' ' && myString.charAt(i-1)!= ' '){
                count++;
            }
        }
        System.out.println("The string has " + count + " words");

        for (int i = myString.length()-1; i >= 0; i--) {
            System.out.printf(myString.charAt(i) + "");
        }
    }
}
