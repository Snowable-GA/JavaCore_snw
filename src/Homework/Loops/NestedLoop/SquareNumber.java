package Homework.Loops.NestedLoop;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        System.out.println("Enter range: ");
        var input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        for (int i = (int) Math.ceil(Math.sqrt(a)); i <= (int) Math.floor(Math.sqrt(b)); i++) {
            System.out.print(i * i + " ");
        }
    }
}
