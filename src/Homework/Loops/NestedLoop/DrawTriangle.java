package Homework.Loops.NestedLoop;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the height: ");
        var input = new Scanner(System.in);
        int height = input.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                if(j < height - i) System.out.print(" * ");
                else System.out.print("  ");
            }
            System.out.println();
        }

        System.out.print("\n \n \n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height; j++) {
                if(j >= height - 1 - i && j <= height - 1 + i) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        System.out.print("\n \n \n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height; j++) {
                if(j == height - 1 - i || j == height - 1 + i || (i == height - 1 && j != 2 * height - 1)) System.out.print(" * ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        System.out.print("\n \n \n");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height; j++) {
                if(j == height - 1) System.out.print((i+1) + " ");
                if((j == height - 1 - i || j == height - 1 + i) && i != 0) System.out.print(" 1 ");
                else System.out.print(" x ");
            }
            System.out.println();
        }
    }
}
