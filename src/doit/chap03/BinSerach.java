package src.doit.chap03;

import java.util.Scanner;

public class BinSerach {

    static int binSearchX(int[] a, int n, int key){
        int pl = 0;    // 검색 범위의 첫 인덱스
        int pr = n-1;  // 검색 범위의 마지막 인덱스

        do {
            int pc = (pl + pr) / 2;
            if(a[pc] == key){
                for(; pc>pl; pc--){
                    if(a[pc-1] <key)
                        break;
                }
                return pc;
            }else if(a[pc] < key){
                pl = pc + 1;
            }else{
                pr = pc -1;
            }
        }while (pl <= pr);

        return -1;
    }

    static int binSearch(int[] a, int n, int key){
        int pl = 0;    // 검색 범위의 첫 인덱스
        int pr = n-1;  // 검색 범위의 마지막 인덱스

        do {
            int pc = (pl + pr) / 2;
            if(a[pc] == key){
                return pc;
            }else if(a[pc] < key){
                pl = pc + 1;
            }else{
                pr = pc -1;
            }
        }while (pl <= pr);

        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.println("x[0]: "); // 첫 요소 입력받음
        x[0] = sc.nextInt();

        for(int i = 1; i <num; i++){
            do {
                System.out.println("x[" + i + "]:");
                x[i] = sc.nextInt();
            }while ( x[i] < x[i-1]);
        }

        System.out.println("검색할 값 : ");
        int ky = sc.nextInt();
        int[] y = new int[num];

        int idx = binSearchX(x, num, ky);

        if( idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
//            System.out.println("그 값은 " + idx +"개 존재합니다.");
            System.out.println("그 값은 x[" + idx + "]");
    }

}
