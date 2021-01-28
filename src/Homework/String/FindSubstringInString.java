package Homework.String;

public class FindSubstringInString {

    public static int FindSubstrings(String bigString, String smallString){
        int meetIndex = 0;
        int count = 0;
        for(int i = 0; i < bigString.length(); i++){
            if(bigString.charAt(i) == smallString.charAt(0)){
                meetIndex = i;
                if(smallString.compareTo(bigString.substring(meetIndex, meetIndex + smallString.length()-1))==1){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "let me fire and let me water, then let me do something let like you let";
        String str2 = "let";
        System.out.println(FindSubstrings(str1, str2));
    }
}
