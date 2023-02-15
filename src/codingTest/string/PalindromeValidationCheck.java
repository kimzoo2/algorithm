package src.codingTest.string;

import java.util.Scanner;

public class PalindromeValidationCheck {

    static String palindromValidationCheck(String str){
        String answer = "NO";

        str=str.toUpperCase().replaceAll("[^A-Z]", ""); // A-Z 단어가 아니면 빈 문자로 return
        String tmp = new StringBuilder(str).reverse().toString();

        if(str.equalsIgnoreCase(tmp)) answer ="YES";

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(palindromValidationCheck(str));
    }
}
