package Homework.Overload.Number;

public class Number {
    /**
     * This method using for finding product between two numbers
     *
     * @param a 1st number
     * @param b 2nd number
     * @return product of them
     */
    public static int findProduct(int a, int b) {
        return (a * b);
    }

    public static long findProduct(long a, long b) {
        return (a * b);
    }

    /**
     * This method using for finding average between two numbers
     * @param a 1st number
     * @param b 2nd number
     * @return average of them
     */
    public static double findAverage(int a, int b) {
        return ((a + b) / 2);
    }

    public static double findAverage(double a, double b) {
        return ((a + b) / 2);
    }

    /**
     *
     * @param a 1st number
     * @param b 2nd number
     * @param c 3rd number
     * @return min of them
     */
    public static int findMin(int a, int b, int c){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        return min;
    }

    public static long findMin(long a, long b, long c){
        long min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findProduct(100, 200));
        System.out.println(findAverage(100.5, 200));
        System.out.println(findMin(9, 6, 7 ));
    }
}
