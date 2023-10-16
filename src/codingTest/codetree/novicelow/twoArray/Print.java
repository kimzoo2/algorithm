package src.codingTest.codetree.novicelow.twoArray;

import java.util.Locale;
import java.util.Scanner;

public class Print {

    public static void main(String[] args) {

        Print print = new Print();
//        print.replaceUpperWord();
        print.averageArray();

    }

    // 2차원 배열 입력
    public void replaceUpperWord(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<5; i++){
            for(int j = 0; j<3; j++){
                String str = sc.next();
                System.out.print(str.toUpperCase() + " ");
            }
            System.out.println();
        }
    }

    // 배열의 평균
    public void averageArray() {
        Scanner sc = new Scanner(System.in);
        int[][] intArr = new int[2][4];

        for(int i = 0; i<2; i++){
            for(int j = 0; j<4; j++){
                intArr[i][j] = sc.nextInt();
            }
        }

        //첫째 줄 - 가로 평균
        //둘째 줄 - 세로 평균
        //마지막 줄 - 전체 평균
        // 소수점 첫째자리까지
        int sum = 0;

        for(int i = 0; i<2; i++){
            int widthSum = 0;
            for(int j = 0; j<4; j++){
                widthSum += intArr[i][j];
                sum += intArr[i][j];
            }
            System.out.printf("%.1f ", (float)widthSum/4);
        }

        System.out.println();

        for(int j = 0; j<4; j++){
            int heightSum = 0;
            for(int i = 0; i<2; i++){
                heightSum += intArr[i][j];
            }
            System.out.printf("%.1f ", (float)heightSum/2);
        }

        System.out.println();

        System.out.printf("%.1f ", (float)sum/4);
    }

    // 특정 원소들의 합
    public void calculateSpecialValue(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        /*
        * 1 2 3
        * * 2 4
        * * * 4
        * * * *
        *의 합을 구하라
        */

        int sum = 0;
        for(int i = 0; i<4; i++){
            for(int j = 0; j<=i; j++){
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
