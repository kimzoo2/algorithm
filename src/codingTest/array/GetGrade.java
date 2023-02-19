package src.codingTest.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetGrade {

    static ArrayList<Integer> getGrade(int n, int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();

        //5
        //87 89 92 100 76
        int[] tmp = Arrays.copyOf(arr, n);

        Arrays.sort(tmp);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(arr[i] == tmp[j]) {
                    System.out.print(tmp[j] + " ");
                    answer.add(n-j);
                }
            }
        }
        return answer;
    }

    static ArrayList<Integer> getGradeLecture(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j == i) continue;
                if(arr[j] > arr[i]) cnt++;
            }

            answer.add(cnt);
            cnt = 1;
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i : getGradeLecture(input1, arr)){
            System.out.print(i + " ");
        }
    }
}
