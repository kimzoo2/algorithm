package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class IgnoreCasting {

    public static void main(String[] args) {
        swapCase();
    }

    // 대문자 소문자 바꾸기
    public static void swapCase(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : charArr) {
            int c = ch;
            if(c <= 90) sb.append((char)(c+32));
            else sb.append((char)(c-32));
        }
        System.out.println(sb);
    }

}
