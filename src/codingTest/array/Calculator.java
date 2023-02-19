package src.codingTest.array;

import java.util.Scanner;

public class Calculator {

    static int calculatorLecture(int n, int[] arr){
        int answer = 0, cnt = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    static int calculator(int n, int[] arr){
        int answer = 0;
        int tmp = 0;

        for(int num : arr){

            if(num != 0) answer += ++tmp;
            else         tmp = 0;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(calculator(input1, arr));
        System.out.println(calculatorLecture(input1, arr));
    }
}
