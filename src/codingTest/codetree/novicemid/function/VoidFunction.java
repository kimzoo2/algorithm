package src.codingTest.codetree.novicemid.function;

import java.util.Scanner;

public class VoidFunction {

    public static void main(String[] args) {
//        printStar();
        commonFactor();
    }

    public static void printStar10(){
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // 별을 10개씩 5번 찍기
    public static void printStar(){
        for(int i = 0; i< 5; i++){
            printStar10();
        }
    }


    public static void printStr(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("12345^&*()_");
        }
    }

    // 인자가 1개인 함수
    public static void isPrime() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printStr(num);

    }

    public static void findGcd(int n, int m){
        int gcd =0;
        for(int i = 1; i<=Math.min(n,m); i++){
            if(n % i == 0 && m % i == 0) gcd = i;
        }
        System.out.println(gcd);
    }

    // 최대 공약수
    public static void commonFactor(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        findGcd(n, m);
    }


}
