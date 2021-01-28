package Homework.Loops.EndlessLoop;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        System.out.println("Enter a, b: ");
        var input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int k;
        do {
            System.out.println("Enter k: ");
            k = input.nextInt();
        }
        while (k == 0);

        for (int i = (int)Math.ceil(Math.sqrt(a)); i < (int)Math.floor(Math.sqrt(b)); i++) {
            if(i*i % k == 0){
                System.out.println(i*i);
                break;
            }
        }
    }
}
