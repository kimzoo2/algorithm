package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class shiftString {

    public static void main(String[] args) {
//        rotateString();
//        reverseStringByShifting();
        shiftByRule();
    }

    // 문자열 밀기
    public static void shiftString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        System.out.println(str.substring(1, len) + str.substring(0, 1));
    }

    // 문자열 돌리기
    // 119ms 10MB
    public static void rotateString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        System.out.println(str);
        for(int i = 0; i<len; i++){
            str = str.substring(len-1, len) + str.substring(0, len-1);
            System.out.println(str);
        }
    }

    // 문자열 한 칸씩 밀어내며 뒤집기
    public static void reverseStringByShifting(){
        /*
        문자열 한 개 입력으로 주어지고 q개의 요청이 주어지면, 각 요청을 수행한 결과를 모두 출력하는 코드를 작성해보세요. 요청의 종류에는 아래의 세 가지가 있습니다.
        1. 가장 앞에 있는 문자를 제외한 나머지 문자를 한 칸씩 앞으로 당기고 가장 앞에 있던 문자를 가장 뒤로 옮깁니다.
        2. 가장 뒤에 있는 문자를 제외한 나머지 문자를 한 칸씩 뒤로 밀고 가장 뒤에 있던 문자를 가장 앞으로 옮깁니다.
        3. 문자열을 좌우로 뒤집습니다.
        */

        // 입력
        //abcd 4
        //1
        //1
        //2
        //3

        // 출력
        //bcda
        //cdab
        //bcda
        //adcb

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        int len = str.length();

        // 1. <- 밀기
        // 2. -> 밀기
        // 3. 뒤집기

        for(int i=0; i<q; i++){
            int request = sc.nextInt();

            if(request == 1){
                str = str.substring(1) + str.substring(0,1);
            }else if(request ==2){
                str = str.substring(len-1) + str.substring(0, len-1);
            }else{
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                str = String.valueOf(sb.reverse());
            }
            System.out.println(str);
        }
    }

    // 규칙에 따라 밀기
    public static void shiftByRule(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rule = sc.next();
        int len = rule.length();
        int strLen = str.length();

        for(int i = 0; i<len; i++){
            if(rule.charAt(i) == 'L'){
                str = str.substring(1) + str.substring(0, 1);
            }else{
                str = str.substring(strLen -1) + str.substring(0, strLen-1);
            }
            System.out.println(str);
        }
        System.out.println(str);
    }
}
