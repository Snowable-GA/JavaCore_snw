package Homework.Loops.For;

import java.util.Scanner;

public class Prime {
    public static boolean checkPrime(int n) {
        var flag = true;
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n >= 3) {
            for (int i = 3; i < (int)Math.sqrt(n); i++) {
                if (n % i == 0) flag = false;
                System.out.print("*");
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        if(checkPrime(n) == true) System.out.println(n + " is a PRIME");
        else System.out.println(n + " is NOT a PRIME");

        System.out.println("Enter range: ");
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i = a; i <= b ; i++) {
            if(checkPrime(i) == true) System.out.printf(i + " ");
        }
    }
}
