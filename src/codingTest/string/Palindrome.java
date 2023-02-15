package src.codingTest.string;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {

    static String palindrome(String str){
//        String result = new StringBuilder(str).reverse().toString();
//        return result.equalsIgnoreCase(str) ? "YES" : "NO";
        String answer = "YES";

        // 각 단어끼리 비교하기
        str = str.toUpperCase(Locale.ROOT);
        int len = str.length();
        for(int i = 0; i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(palindrome(input1));
    }
}
