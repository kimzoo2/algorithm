package src.codingTest.string;

import java.util.Scanner;

public class DupDelete {

    static String dupDelete(String s){

        String answer = "";

        // 내가 푼 방법
        /*
        char[] chArr = s.toCharArray();

        for( char ch : chArr ){
            String tmp = Character.toString(ch);
            if(!answer.contains(tmp))answer += tmp;
        }
        */

        for(int i = 0; i<s.length(); i++){
//            System.out.println(s.charAt(i) + " " + i + " " + s.indexOf(s.charAt(i)));
            // indexOf : 처음에 발견된 index를 return 해
            if(s.indexOf(s.charAt(i)) == i) answer += s.charAt(i);

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(dupDelete(str));
        return ;
    }
}
