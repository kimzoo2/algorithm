package src.doit.chap03;

import java.util.Scanner;

public class SearchIdx {

    static int[] copyArray(int[] idx, int n){
        int[] temp = new int [n+1];

        for(int i = 0; i<n; i++){
            temp[i] = idx[i];
        }

        return temp;
    }

    static int serachIdx(int[] a, int n, int key, int[] idx){
        int count = 0;

        for(int i = 0; i<n; i++){
            if(a[i] == key) {
                idx = copyArray(idx, count);
                idx[count++] = key;
            }
        }

        return count == 0 ? -1 : count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i <num; i++){
            System.out.println("x[" + i + "]:");
            x[i] = sc.nextInt();
        }

        System.out.println("검색할 값 : ");
        int ky = sc.nextInt();
        int[] y = new int[0];

        int idx = serachIdx(x, num, ky, y);

        if( idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 " + idx +"개 존재합니다.");
    }
}
