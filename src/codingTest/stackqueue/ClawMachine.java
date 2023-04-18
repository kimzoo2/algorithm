package src.codingTest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class ClawMachine {

    public void clawMachine(int size, int[][] machine, int cnt, int[] moves){
        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        for(int move : moves){
            for(int i = 0; i<size; i++){
                int aDoll = machine[i][move-1];

                if(aDoll > 0){
                    if(!basket.isEmpty() && basket.peek() == aDoll){
                        basket.pop();
                        answer++;
                    }else{
                        basket.push(aDoll);
                    }
                    machine[i][move-1] = 0;
                    break;
                }
            }
        }

        System.out.println(answer*2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] machine = new int[len][len];

        for(int i = 0; i<len; i++){
            for(int j = 0; j<len; j++){
                machine[i][j] = sc.nextInt();
            }
        }

        int moveCnt = sc.nextInt();
        int[] moves = new int[moveCnt];
        for(int i = 0; i<moveCnt; i++){
            moves[i]= sc.nextInt();
        }

        ClawMachine cm = new ClawMachine();

        cm.clawMachine(len, machine, moveCnt, moves);
    }
}
