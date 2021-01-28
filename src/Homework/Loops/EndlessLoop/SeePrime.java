package Homework.Loops.EndlessLoop;

import java.util.Scanner;

public class SeePrime {
    public static void main(String[] args) {
        int number;
        do{
            System.out.println("Enter a number: ");
            var input = new Scanner(System.in);
            number = input.nextInt();
        } while (PrimeDivisor.checkPrime(number) == false);

        System.out.println("This number you just enter is a PRIME!");
    }
}
