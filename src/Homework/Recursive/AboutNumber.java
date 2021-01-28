package Homework.Recursive;

public class AboutNumber {
    public static int countNumber(int n){
        if(n == 0) return 0;
        else return (1 + countNumber(n/10));
    }

    public static int findFirstNumber(int n){
        return n / (int)(Math.pow(10, (countNumber(n))-1));
    }

    public static void main(String[] args) {
        System.out.println(countNumber(96732));
        System.out.println(findFirstNumber(96732));
    }
}
