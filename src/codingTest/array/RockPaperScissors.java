package src.codingTest.array;

import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {

    // 내가 푼 방법 time = 187ms / memory = 27MB
    static ArrayList<String> rockPaperScissors(int n, int[] person1, int[] person2){
        ArrayList<String> answer = new ArrayList<>();

        //가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
        for(int i = 0; i<n; i++){
            int p1 = person1[i];
            int p2 = person2[i];

            if(p1 == p2) answer.add("D");
            else if(p1 > p2){
                if(p1 == 3 && p2 == 1) answer.add("B"); // 보 vs 가위
                else answer.add("A");
            }else{
                if(p2 == 3 && p1 == 1) answer.add("A"); // 보 vs 가위
                else answer.add("B");
            }
        }
        return answer;
    }

    // 강의로 푼 방법 time = 170ms / memory = 27MB
    static String rockPaperScissorsLecture(int n, int[] a, int[] b){
        String answer = "";
        //가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
        for(int i = 0; i<n; i++){
            if(a[i] == b[i]) answer+= "D";
            else if(a[i] == 1 && b[i] == 3)answer+= "A";
            else if(a[i] == 2 && b[i] == 1)answer+= "A";
            else if(a[i] == 3 && b[i] == 2)answer+= "A";
            else answer+= "B";
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        int[] input2 = new int[input1];
        int[] input3 = new int[input1];
        for(int i = 0; i<input1; i++){
            input2[i] = in.nextInt();
        }
        for(int i = 0; i<input1; i++){
            input3[i] = in.nextInt();
        }

        for(char x : rockPaperScissorsLecture(input1, input2, input3).toCharArray()){
            System.out.println(x);
        }
    }
}
