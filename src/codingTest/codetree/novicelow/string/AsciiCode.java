package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class AsciiCode {

    public static void main(String[] args) {
//        sumAsciiCode();
//        castingAsciiCode();
        beforeAlphabet();
    }
    // 아스키코드의 합과 차
    public static void sumAsciiCode(){
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        int b = sc.next().charAt(0);

        System.out.println(a+b);
        if(a > b)System.out.println(a-b);
        else System.out.println(b-a);
    }

    // 아스키코드 변환
    public static void castingAsciiCode(){
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        int b = sc.nextInt();

        System.out.println(a + " " + (char)b);
    }

    // 그 전 알파벳
    public static void beforeAlphabet(){
        Scanner sc = new Scanner(System.in);
        int n = sc.next().charAt(0);

        System.out.println(n== 97 ?'z' : (char)(n-1));
    }
}
