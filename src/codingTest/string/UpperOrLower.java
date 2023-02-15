package src.codingTest.string;

import java.util.Scanner;

public class UpperOrLower {

    static String solution(String str){
        String answer =  "";

        // toUpperCase, toLowerCase 사용하기
//        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x); // 소문자 -> 대문자
//            else answer += Character.toLowerCase(x);                         // 대문자 -> 소문자
//        }

        // ascii 사용하기
        // A 65 ~ 90
        // a 97 ~ 122
        for(char x : str.toCharArray()){
            if(x >= 65 && x <= 90) answer+=(char)(x+32);
            else answer+=(char)(x-32);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(solution(str));

    }
}
