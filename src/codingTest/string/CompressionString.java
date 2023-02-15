package src.codingTest.string;

import java.util.Scanner;

public class CompressionString {

    // 내가 푸는 방법
    static String compressionString(String str){
        String answer = "";
        int cnt = 1;
        char bfCh = '0';

        for(int i = 0; i<str.length(); i++){
            if(i>0) bfCh = str.charAt(i-1);
            if(bfCh == str.charAt(i)) cnt++;
            else {
                if(cnt > 1) answer += cnt;
                answer += String.valueOf(str.charAt(i));
                cnt = 1;
            }
        }

        if(cnt > 1){
            answer += cnt;
        }

        return answer;
    }

    //강의로 푸는 방법
    static String solution(String s){
        String answer = "";
        s = s + " ";
        int cnt = 1;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else {
                answer +=s.charAt(i);
                if(cnt>1) answer += String.valueOf(cnt);
                cnt =1;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        //KKHSSSSSSSE
        //KSTTTSEEKFKKKDJJGG
        System.out.println(compressionString(input1));
        System.out.println(solution(input1));
    }
}
