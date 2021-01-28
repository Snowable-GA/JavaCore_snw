package Homework.Math;

import java.util.Scanner;

//Enter n and take the absolute value of n
public class Work1 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = input.nextInt();
        System.out.println("Absolute value of n = " + Math.abs(n));
    }
}
