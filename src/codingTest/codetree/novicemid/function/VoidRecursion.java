package src.codingTest.codetree.novicemid.function;

import java.util.Scanner;

public class VoidRecursion {
    static int inputNum = 0;

    public static void main(String[] args) {
//        printHelloWorld();
//        printNumber();
        printStar();
    }

    // hello world
    public static void printHelloWorld(){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        printHelloWorld(cnt);
    }

    public static void printHelloWorld(int n){
        if(n == 0) return;
        else {
            System.out.println("HelloWorld");
            printHelloWorld(n - 1);
        }
    }

    // 숫자 차례로 출력하기
    // 142ms 10MB
    public static void printNumber() {
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();
        printNumber(1);
    }

    public static void printNumber(int num){
        if(num == inputNum+1) {
            System.out.println();
            return;
        }
        else{
            System.out.print(num + " ");
            printNumber(num+1);
            System.out.print(num + " ");
        }
    }

    // 재귀함수를 이용한 별 출력 2
    // 172ms 10MB
    public static void printStar(){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        printStar(cnt);
    }

    public static void printStar(int cnt){
        if(cnt == 0) return;
        else{
            for(int i = 0; i<cnt; i++) System.out.print("* ");
            System.out.println();
            printStar(cnt-1);
            for(int i = 0; i<cnt; i++) System.out.print("* ");
            System.out.println();
        }
    }



}
