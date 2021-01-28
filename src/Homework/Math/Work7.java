package Homework.Math;

import java.util.Scanner;

//Enter integer n and random generating number in [0, n]
public class Work7 {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < 50; i++) {
            System.out.println(Math.random()+n-1);
        }

    }
}
