package Homework.Loops.For;

import java.util.Scanner;



public class Fibonacci {
    public static boolean checkFibonacci(long n){
        long i = 0;
        long fib0 = 1, fib1 = 1;
        long fibn = fib0 + fib1;
        while(fibn <= n){
            fibn = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibn;
            if(fibn == n){
                return true;
            }
        }
        return false;
    }

    public static long makeFibonacci(int n){
        long i = 0;
        long fib0 = 1, fib1 = 1;
        long fibn = fib0 + fib1;
        while(i < n-1){
            fibn = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibn;
            i++;
        }
        return fibn;
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        var input = new Scanner(System.in);
        int n = input.nextInt();

        long i = 0;
        long fib0 = 1, fib1 = 1;
        long fibn = fib0 + fib1;
        while(i < n-1){
            fibn = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibn;
            i++;
        }

        System.out.println("The fibonacci f" + n + " = " + fibn);

        for (int j = 10; j < 20; j++) {
            System.out.printf(makeFibonacci(j) + "  ");
        }
    }
}
