package Homework.Loops.NestedLoop;

import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        var input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n-1 || j == n-1 || i == j || i == n-1-j) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
