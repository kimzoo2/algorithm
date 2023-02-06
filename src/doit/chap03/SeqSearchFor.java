package src.doit.chap03;

import java.util.Scanner;

public class SeqSearchFor {

    static int seqSearchFor(int[] a, int n, int key){

        for(int i = 0; i<n; i++){

            if(a[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i <num; i++){
            System.out.println("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 값 : "); // 키값을 입력받음
        int ky = stdIn.nextInt();

        int idx = seqSearchFor(x, num, ky);

        if(idx == -1){
            System.out.println("존재하지 않는 값입니다.");
        }else{
            System.out.println("그 값은 x[" +idx +"]에 있습니다.");
        }
    }
}
