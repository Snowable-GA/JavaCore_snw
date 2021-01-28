package Homework.Method;

public class RevertString {
    public static void revertString(String myString) {
        for (int i = myString.length() - 1; i >= 0; i--) {
            System.out.print(myString.charAt(i));
        }
    }

    public static void main(String[] args) {
        String myString = "Hello everyone, are you OK?";
        revertString(myString);
    }
}
