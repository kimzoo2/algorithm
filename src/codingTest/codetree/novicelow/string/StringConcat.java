package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class StringConcat {

    public static void main(String[] args) {
//        divideString();
        appendString();
    }
    
    // 문자열 나누기
    // 123ms 10MB
    public static void divideString(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        StringBuilder str = new StringBuilder();

        for(int i = 0; i<len; i++){
            str.append(sc.nextInt());
        }

        int strLen = str.length();
        int cnt = 0;

        for(int i = 0; i<strLen; i++){
            System.out.print(str.charAt(i));
            cnt++;
            if(cnt % 5 == 0){
                System.out.println();
            }
        }
    }

    // 두 문자열을 이어붙였을 때
    public static void appendString() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = a+b;
        String ba = b+a;

        if(ab.equals(ba)) System.out.println(true);
        else System.out.println(false);
    }
}
