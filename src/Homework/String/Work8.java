package Homework.String;

import java.util.Scanner;

//Enter a string and show the index with character of first and last of this string
public class Work8 {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String myString = input.nextLine();

        for (int i = 0; i < myString.length(); i++) {
            if(i == 0 || i == myString.length()-1){
                System.out.println("Position " + i+1 + " = " + myString.charAt(i));
            }
        }
    }
}
