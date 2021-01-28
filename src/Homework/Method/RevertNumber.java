package Homework.Method;

public class RevertNumber {
    public static boolean isReverseNumber(int number){
        int temp = number;
        int reverseNumber = 0;
        while (number > 0){
            reverseNumber = reverseNumber * 10 +  (number % 10);
            number /= 10;
        }
        return (reverseNumber == temp);
    }

    public static void main(String[] args) {
        System.out.println(isReverseNumber(198991));
    }
}
