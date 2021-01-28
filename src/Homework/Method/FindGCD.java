package Homework.Method;

public class FindGCD {
    public static int findGCD(int a, int b) {
        while (a % b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(1200, 70));
    }
}
