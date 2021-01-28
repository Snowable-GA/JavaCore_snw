package Homework.Method;

public class RealNumber {
    public static double findMin(double num1, double num2, double num3){
        return (num1 < num2)? ((num1 < num3)? num1: num3): ((num2 < num3)? num2: num3);
    }

    public static double findMax(double num1, double num2, double num3){
        return (num1 > num2)? ((num1 > num3)? num1: num3): ((num2 > num3)? num2: num3);
    }

    public static void main(String[] args) {
        System.out.println(findMin(5, 14, 9));
        System.out.println(findMax(5, 9, 14));
    }
}
