package src.codingTest.codetree.novicelow.twoArray;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
//        fillRectangleDown();
//        fillZigZag();
        fillDiagonal();
    }

    //아래로 사각형 채우기
    public static void fillRectangleDown(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int[][] arr = new int[n][n];

        for(int i = 0; i<n; i++){ //열
            for(int j = 0; j<n; j++){ //행
                arr[j][i] = num++;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt+ " ");
            }
            System.out.println();
        }
    }

    // 지그재그로 숫자 채우기
    public static void fillZigZag(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 0;
        int[][] arr = new int[n][m];

        for(int j = 0; j<m; j++){
            if(j % 2 == 0){ //짝수면 1 2 3 4
                for(int i = 0; i<n; i++){
                    arr[i][j] = num++;
                }

            }else{ // 홀수면 4 3 2 1
                for(int i = n-1; i>=0; i--){
                    arr[i][j] = num++;
                }
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    // 대각선 채우기
    public static void fillDiagonal(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        int[][] arr = new int[n+2][m+2];

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<m+1; j++){
                arr[i][j] = 1;
            }
        }

        // 1 * *
        // * * *
        int x, y, originX, originY;
        x = y = originX = originY = 1;

        while (true) {
            if (arr[x][y] == 0){
                if(originX > m){ //오른쪽 끝에 닿았을 때
                    x=++originY;
                    y=originX-1;
                }else{
                    x=originY;
                    y=++originX;
                }
            }else{
                arr[x++][y--] = num++;
            }
            if(originY>n && originX>m) break;
        }

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<m+1; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
