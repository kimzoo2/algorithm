package src.codingTest.sort;

import java.util.Scanner;

public class BubbleSort {

    public void bubbleSortLecture(int x, int[] arr){
        for(int i = 0; i<x-1; i++){
            for(int j = 0; j<x-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public void bubbleSort(int x, int[] arr){

        for(int i = 0; i<x-1; i++){
            for(int j = 1; j<x-i; j++){
                int tmp = arr[j-1];

                if(tmp > arr[j]){
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int i = 0; i<x; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = new int[x];

        for(int i = 0; i<x; i++){
            arr[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();

        bs.bubbleSort(x, arr);
    }
}
