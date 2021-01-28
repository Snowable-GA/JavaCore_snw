package Homework.Method;

public class AboutNumber {
    public static long findTheFirstNumber(long number) {
        long result = 0;
        while (number > 0) {
            result = number % 10;
            number /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findTheFirstNumber(412312));
    }
}
