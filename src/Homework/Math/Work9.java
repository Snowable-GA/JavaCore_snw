package Homework.Math;

public class Work9 {
    public static void main(String[] args) {
        int a = 60, b = 60, c = 80;
        int p = (a + b + c)/2;
        System.out.println("Area of this triangle: " + Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }

}
