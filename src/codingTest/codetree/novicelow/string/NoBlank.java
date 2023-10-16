package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class NoBlank {

    public static void main(String[] args) {
//        shortString();
        oncePrint();
    }

    // 가장 짧은 문자열 T
    public static void shortString(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int aLen = a.length();
        int bLen = b.length();
        int cLen = c.length();

        int min = aLen;
        int max = aLen;

        if(min > bLen) min = bLen;
        if(min > cLen) min = cLen;

        if(max < bLen) max = bLen;
        if(max < cLen) max = cLen;

        System.out.println(max - min);
    }

    // 공백 있는 문자열 한 번에 출력
    public static void oncePrint(){
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i) != ' '){
                System.out.print(a.charAt(i));
            }
        }

        for(int i = 0; i<a.length(); i++){
            if(b.charAt(i) != ' '){
                System.out.print(b.charAt(i));
            }
        }
    }
}
