package src.codingTest.array;

import java.util.Scanner;

public class GetGridMax {

    static int getGridMax(int n , int[][] binaryArr){
        int answer = 0;
        int temp = 0;
        int temp1 = 0;

        for(int i = 0; i<n; i++){
            temp = 0;
            temp1 = 0;
            for(int j = 0; j<n; j++){
                temp += binaryArr[i][j];
                temp1 += binaryArr[j][i];
            }

            answer = Math.max(answer, temp);
            answer = Math.max(answer, temp1);
        }

        temp = 0; //순대각선
        temp1 = 0; // 역대각선

        for(int i = 0; i<n; i++){
            temp += binaryArr[i][i];
            temp1 += binaryArr[i][n-i-1];
        }

        answer = Math.max(answer, temp);
        answer = Math.max(answer, temp1);

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] binaryArr = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                binaryArr[i][j] = sc.nextInt();
            }
        }

        System.out.println(getGridMax(n, binaryArr));
    }
}
