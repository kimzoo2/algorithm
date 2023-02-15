package src.codingTest.string;

import java.util.Scanner;

public class WordInSentence {

    static String solution(String str){
        String answer =  "";

//        int m= Integer.MIN_VALUE;
        // split
//        String[] s = str.split(" ");
//        for(String x : s){
//            int len=x.length();
//            if(len>m){
//                m=len;
//                answer=x;
//            }
//        }

        // indexOf, SubString
        int m= Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1) { // 띄어쓰기가 발견되면 index를 반환함. 띄어쓰기를 발견하지 못하면 -1
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){ // >=이면 같은 케이스의 답으로 변경됨
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }

        if(str.length()>m) answer=str; // 마지막 단어
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(solution(str));

    }
}
