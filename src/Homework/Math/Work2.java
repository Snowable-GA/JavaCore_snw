package Homework.Math;

import java.util.Scanner;

//Find square root and cube root of a number from keyboard
public class Work2 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = input.nextInt();
        System.out.println("Square root of n = " + Math.sqrt(n));
        System.out.println("Cube root of n = " + Math.cbrt(n));
    }
}
