package src.codingTest.codetree.novicemid.recursion;

import java.io.*;
import java.util.Scanner;

public class ReturnRecursion {

    public static void main(String[] args) throws IOException {
//        sum();
//        square();
//        countRecursion();
//        fibonacci();
//        max();
        weirdSequence();
    }
    // 기본문제 : 1부터 특정 수까지의 합
    // 143ms 10MB
    // 동일한 상황이 반복되는 것을 재귀적으로 찾기
    // 지극히 당연한 종료조건을 정의하기
    public static void sum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if(n == 1) return 1;
        return sum(n-1) + n;
    }

    //각 자리 숫자의 제곱
    //142ms 10MB
    public static void square(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(square(n));
    }

    public static int square(int n){
        if(n < 10) return n*n;

        else {
            int digit = (n % 10);
            return square(n/10) + (digit * digit);
        }
    }
    // 1의 되는 순간까지
    // 97ms 8MB
    public static void countRecursion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //n이 짝수면 2로 나누고
        //n이 홀수면 3으로 나눈 몫을 취하는 작업을 하다 1이 되면 횟수를 구해라
        System.out.println(countRecursion(n));
    }

    public static int countRecursion(int n){
        if(n == 1) {
            return 0;
        }else{
            if(n % 2 == 0) n /= 2;
            else n /= 3;
            return countRecursion(n)+1;
        }
    }

    // 피보나치
    // 105ms 8MB
    public static void fibonacci() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int n) {
        if(n <=2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // 재귀함수를 이용한 최댓값
    // 91ms 8MB
    public static void max() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(max(cnt-1, arr));
    }

    public static int max(int cnt, int[] arr){
        if(cnt == 0) return arr[0];
        else {
            int result = max(cnt-1, arr);
            /*
            if(result < arr[num]){
                return arr[num];
            }else{
                return result;
            }
            */
            return Math.max(result, arr[cnt]);
        }
    }

    // 이상한 수열
    // 88ms 8MB
    public static void weirdSequence() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(weirdSequence(num));
    }

    public static int weirdSequence(int num){
        if(num == 1) return 1;
        if(num == 2) return 2;
        return weirdSequence(num/3) + weirdSequence(num -1);
    }
}

