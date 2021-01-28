package Homework.Loops.EndlessLoop;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1, n = 0;
        while(sum <= 500){
            sum += i;
            i++;
        }
        System.out.println("n = " + i + " sum = " + sum);
    }
}
