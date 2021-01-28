package Homework.Math;

import java.util.Scanner;

//Enter a degree number and calculate sin(), cos()
public class Work3 {
    public static void main(String[] args) {
        int degree;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degree: ");
        degree = input.nextInt();
        System.out.println("Sin of this degree: " + Math.sin(Math.toRadians(degree)));
        System.out.println("Cosin of this degree: " + Math.cos(Math.toRadians(degree)));
    }
}
