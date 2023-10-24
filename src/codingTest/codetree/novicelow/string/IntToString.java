package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {
//        sumAndOne();
        shiftSum();
    }

    // 두 수의 합과 1
    public static void sumAndOne(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = Integer.toString(a+b);
        int cnt = 0;
        for(int i = 0; i<result.length();i++){
            if(result.charAt(i) == '1') cnt++;
        }

        System.out.println(cnt);
    }

    public static void shiftSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for(int i = 0; i<a; i++){
            sum += sc.nextInt();
        }

        String str = Integer.toString(sum);
        str = str.substring(1) + str.substring(0, 1);
        System.out.println(str);
    }
}
