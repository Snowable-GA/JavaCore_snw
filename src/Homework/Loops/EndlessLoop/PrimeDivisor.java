package Homework.Loops.EndlessLoop;

import java.util.Scanner;

public class PrimeDivisor {

    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n >= 3){
            for (int i = 3; i < n; i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        var input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 2; i < n; i++) {
            if(n % i == 0 && checkPrime(i) == true) {
                System.out.print(i + " ");
                break;
            }
        }
    }
}
