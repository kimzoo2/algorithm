package src.codingTest.array;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxPrint {

    // 내가 푼 방법
    static int maxPrint(int n, int[] intArr){

        int bf = 0;

        for(int i = 0; i<n; i++){
            if(bf < intArr[i]){
                System.out.print(intArr[i] + " ");
            }
            bf =intArr[i];
        }

        return 0;
    }

    // 강의에서 푼 방법
    static ArrayList<Integer> maxPrintLecture(int n, int[] intArr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(intArr[0]);
        for(int i = 1; i<n; i++){
            if(intArr[i]>intArr[i-1]) answer.add(intArr[i]);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        int[] input2 = new int[input1];
        for(int i = 0; i<input1; i++){
            input2[i] = in.nextInt();
        }

        for (int x : maxPrintLecture(input1, input2)){
            System.out.print(x+" ");
        }
        maxPrint(input1, input2);
    }

}
