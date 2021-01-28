package Homework.Loops.SwitchCase;

import java.util.Scanner;

public class AnimalDesignation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ID of your animal: ");
        byte ID = input.nextByte();

        switch (ID){
            case 0:
                System.out.println("EXIT THE PROGRAM ...");
                break;
            case 1:
                System.out.println("The Rat");
                break;
            case 2:
                System.out.println("The Ox");
                break;
            case 3:
                System.out.println("The Tiger");
                break;
            case 4:
                System.out.println("The Cat");
                break;
            case 5:
                System.out.println("The Dragon");
                break;
            case 6:
                System.out.println("The Snake");
                break;
            case 7:
                System.out.println("The Horse");
                break;
            case 8:
                System.out.println("The Goat");
                break;
            case 9:
                System.out.println("The Monkey");
                break;
            case 10:
                System.out.println("The Rooster");
                break;
            case 11:
                System.out.println("The Dog");
                break;
            case 12:
                System.out.println("The Pig");
                break;
            default:
                System.out.println("Please enter the ID from 1 to 12 ...");
        }
    }
}
