package Homework.Math;

import java.util.Scanner;

/*Enter a, b and:
    1. Find min, max of (a, b)
    2. Rounding a and b
    3. Calculate a^b and b^a
*/
public class Work4_5_6 {
    public static void main(String[] args) {
        System.out.println("Enter a, b: ");
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();

        //1. Find min, max of (a, b)
        float min, max;
        min = (a < b)? a: b;
        max = (a > b)? a: b;
        System.out.println("Min of (a,b) = " + min);
        System.out.println("Max of (a,b) = " + max);

        //2. Rounding a and b
        System.out.println("Rounding a = " + Math.round(a) + ", b = " + Math.round(b));

        //3. Calculate a^b and b^a
        System.out.println("a^b = " + Math.pow(a, b));
        System.out.println("b^a = " + Math.pow(b, a));
    }
}
