package Homework.Branching.If_Else;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        System.out.println("Enter two strings: ");
        Scanner input = new Scanner(System.in);
        String string1, string2;
        string1 = input.nextLine();
        string2 = input.nextLine();

        //Compare two strings (follow ASCII)
        if(string1.compareTo(string2) < 0){
            System.out.println(string1 + " IS SMALLER THAN " + string2);
        }
        else if(string1.compareTo(string2) > 0){
            System.out.println(string1 + " IS BIGGER THAN " + string2);
        }
        else{
            System.out.println(string1 + " IS EQUAL " + string2);
        }
    }
}
