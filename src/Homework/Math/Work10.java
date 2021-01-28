package Homework.Math;

public class Work10 {
    public static void main(String[] args) {
        double a, b , c = 100;
        int alpha = 35;
        a = 100*Math.sin(Math.toRadians(alpha));
        b = 100*Math.cos(Math.toRadians(alpha));
        System.out.println("Canh a = " + a);
        System.out.println("Canh b = " + b);

        double area = a*b/2;
        double perimeter = (a + b + c)/2;
        System.out.println("Dien tich tam giac: " + area);
        System.out.println("Chu vi tam giac: " + perimeter);
    }
}
