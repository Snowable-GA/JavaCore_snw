package Homework.Math;

import java.util.Scanner;

//Enter r and calculate perimeter and area
public class Work8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter r: ");
        float r = input.nextFloat();
        System.out.println("Perimeter of this circle: " + Math.PI*2*r);
        System.out.println("Area of this circle: " + Math.PI*r*r);
    }
}
