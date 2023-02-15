package src.codingTest.string;

import java.util.Arrays;
import java.util.Scanner;

public class ShortDistance {

    static int[] shortDistance(String str, char c){
        String answer = "";

        int pos = 1000;
        int[] intArr = new int[str.length()];

        // 왼쪽
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == c) pos = 0;
            else pos++;

            intArr[i] = pos;
        }

        pos = 1000;

        // 오른쪽
        for(int i = str.length()-1; i>=0; i--){
            if(str.charAt(i) == c) pos = 0;
            else {
                pos++;
                if(intArr[i] > pos) intArr[i] = pos;
            }

        }

        return intArr;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String s = in.next();
        char c = in.next().charAt(0);

        for(int x : shortDistance(s, c)){
            System.out.print(x + " ");
        }
    }
}
