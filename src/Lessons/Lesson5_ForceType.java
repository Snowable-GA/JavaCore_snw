package Lessons;

public class Lesson5_ForceType {
    public static void main(String[] args) {
        //Hep sang rong
        float f = 1.23432523f;
        int y = (int)f;

        //Rong sang hep
        int a = 3;
        int b = 8;
        double x = (double) a / b;
        System.out.println(x);

        //Kieu tham chieu
        Float F = 1.51323f;
        System.out.println(F.hashCode());


        System.out.println((Integer)Math.round(F) instanceof Integer);
        System.out.println(Math.ceil(F));
        System.out.println(Math.floor(F));
    }
}
