package Homework.Method;

public class CountVowel {
    public static int countVowel(String myString) {
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'u' || myString.charAt(i) == 'e'
                    || myString.charAt(i) == 'o' || myString.charAt(i) == 'a' || myString.charAt(i) == 'i') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowel("Welcome to the Summoner Rift!"));
    }
}
