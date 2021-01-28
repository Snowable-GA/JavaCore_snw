package Lessons;

import java.util.Scanner;

public class Lesson3_Variables {
    public static void main(String[] args) {
        //
        final boolean TEST = true;

        //Variable for ages: Int
        int age = 21;
        System.out.println(age);

        //Variable for name: String
        String myName = "Hung";
        System.out.println(myName);

        //Input from keyboard
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap nam sinh cua ban: ");
        int birthday = input.nextInt();
        input.nextLine();

        //Input all line
        System.out.println("Nhap so du tai khoan: ");
        String money = input.nextLine();

    }
}
