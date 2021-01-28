package Homework.Loops.For;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        var input = new Scanner(System.in);
        int n = input.nextInt();


        var n_ = n;
        var anagram = 0;
        while(n > 0){
            var temp = n % 10;
            anagram = anagram*10 + temp;
            n /= 10;
        }

        if(anagram == n_) System.out.println("Beautiful number!");
        else System.out.println("Not a beautiful number!");
    }
}
