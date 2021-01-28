package Homework.SwitchExpression;

import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        System.out.println("Enter month:" );
        var input = new Scanner(System.in);
        byte m = input.nextByte();

        String result = switch (m){
            case 1, 2, 3 -> "Spring";
            case 4, 5, 6 -> "Summer";
            case 7, 8, 9 -> "Autumn";
            case 10, 11, 12 -> "Winter";
            default -> "Invalid month, please enter again!";
        };

        System.out.println(result);
    }
}
