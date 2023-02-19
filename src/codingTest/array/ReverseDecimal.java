package src.codingTest.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseDecimal {

    static boolean isDecimal(int num){

        if(num < 2) return false;

        for(int i = 2; i<num; i++){

            if(num % i == 0) return false;
        }

        return true;
    }

    static void reverseDecimal(int n, int[] arr){
        int[] answer = {};

        //N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력
        // 9
        // 32 55 62 20 250 370 200 30 100

        for(int num : arr){
            // 32 => 23
            StringBuilder sb = new StringBuilder(Integer.toString(num)).reverse();
            int reversNumber = Integer.parseInt(String.valueOf(sb));

            if(isDecimal(reversNumber)) System.out.print(reversNumber + " ");
        }

    }

    static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i = 2; i<num; i++){
            if(num%i==0) return false;
        }

        return true;
    }

    static ArrayList<Integer> reverseDecimalLecture(int n, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int tmp =arr[i];
            int res = 0;
            // 123 -> 321
            while(tmp > 0){
                int t = tmp % 10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int [input1];

        for(int i = 0; i<input1; i++){
            arr[i] = in.nextInt();
        }

        for(int i : reverseDecimalLecture(input1, arr)){
            System.out.print(i + " ");
        }

        reverseDecimal(input1, arr);
    }
}
