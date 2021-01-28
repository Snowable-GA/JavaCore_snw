package Homework.Recursive;

public class ReverseString {
    public static void reverseString(String myString, int length){
        if(length < 0){
            return;
        }
        else System.out.print(myString.charAt(length));
        reverseString(myString, length - 1);
    }

    public static void main(String[] args) {
        String myString = "Hello my friend!";
        int length = myString.length() - 1;
        reverseString(myString, length);
    }
}
