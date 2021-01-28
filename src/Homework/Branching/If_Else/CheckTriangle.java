package Homework.Branching.If_Else;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        double a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        //Check if this three edges form a triangle
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Three number form a triangle!");
        }
        else System.out.println("Three number can't form a triangle.");
    }
}
