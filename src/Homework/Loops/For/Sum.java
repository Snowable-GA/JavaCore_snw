package Homework.Loops.For;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter n: ");
        var n = input.nextInt();

        var sum1 = 0.0;
        var sum2 = 0;

        for (var i = 1; i <= n; i++) {
            sum1 += (1.0 / i);
            sum2 += i;
        }
        System.out.printf("%4.2e", sum1);
        System.out.println(sum2);
    }
}
