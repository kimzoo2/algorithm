package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class AsciiCode {

    public static void main(String[] args) {
        sumAsciiCode();
    }
    // 아스시코드의 합과 차
    public static void sumAsciiCode(){
        Scanner sc = new Scanner(System.in);
        int a = sc.next().charAt(0);
        int b = sc.next().charAt(0);

        System.out.println(a+b);
        if(a > b)System.out.println(a-b);
        else System.out.println(b-a);

    }
}
