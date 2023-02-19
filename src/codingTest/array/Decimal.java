package src.codingTest.array;

import java.util.Scanner;

public class Decimal {

    static int decimal(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i =2; i<=n; i++){

            if(ch[i]== 0){
                answer++;
                for(int j=i; j<=n; j=j+i)
                    ch[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(decimal(input1));
    }
}
