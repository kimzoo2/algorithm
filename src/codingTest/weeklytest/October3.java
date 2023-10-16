package src.codingTest.weeklytest;

import java.util.Scanner;

public class October3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(b > a && b < c) System.out.println(1);
        else System.out.println(0);
    }

    // 격자
    public static void grid(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x, y;
        x = sc.nextInt() -1;
        y = sc.nextInt() -1;

        int compareNum = arr[x][y];

        for(int i = x; i<n; i++){
            for(int j = 0; j<=y; j++){
                if(arr[i][j] < compareNum) arr[i][j] = 0;
            }
        }

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    // 10분 시간초과
    public static void random(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Point[] ptArr = new Point[k];
        int[][] arr = new int[n][n];

        for(int i = 0; i<k; i++){
            ptArr[i].setDirection(sc.next().charAt(0));
            ptArr[i].setDistance(sc.nextInt());
        }

        int x = 0;
        int y = 0;

        for(int i = 0; i<k; i++){
            switch (ptArr[i].getDirection()){
                case 'S' : x += ptArr[i].getDistance(); break;
                case 'N' : x -= ptArr[i].getDistance(); break;
                case 'W' : y -= ptArr[i].getDistance(); break;
                case 'E' : y += ptArr[i].getDistance(); break;
                default: x += ptArr[i].getDistance(); break;
            }
        }

    }

}

class Point {
    char direction;
    int distance;

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
