package Homework.Loops.SwitchCase;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month: ");
        byte month;
        month = input.nextByte();

        switch (month){
            case 0:
                System.out.println("EXIT!");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("This is SPRING!");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("This is SUMMER!");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("This is AUTUMN!");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("This is WINTER!");
                break;
            default:
                System.out.println("Sorry, please enter the month from 1 to 12 ...");
        }
    }
}
