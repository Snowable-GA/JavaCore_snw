package Homework.Branching.If_Else;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        System.out.println("Enter the parameter of this trapezoid: ");
        double bigBase, smallBase, height;
        Scanner input = new Scanner(System.in);
        bigBase = input.nextFloat();
        smallBase = input.nextFloat();
        height = input.nextFloat();

        //Trapezoid area
        double area;
        area = (smallBase + bigBase) * height / 2;
        if(bigBase > smallBase){
            System.out.println("Area of this trapezoid is: " + area);
        }
        else System.out.println("Can't calculate!");

    }
}
