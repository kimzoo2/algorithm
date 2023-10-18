package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class StringIterator {

    public static void main(String[] args) {
//        subString();
        runLengthEncoding2();
    }

    // 문자열에서 문자 출력
    public static void printString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(char ch : str.toCharArray()){
            System.out.println(ch);
        }
    }

    // 문자열 범위 출력하기
    public static void subString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        int len = str.length();

        for(int i = len-1; i>=len-num; i--){
            System.out.print(str.charAt(i));
            if(i == 0) break;
        }
    }

    // Run Length 인코딩
    // 122ms 10MB
    public static void runLengthEncoding(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        int lt = 0;
        int rt = 0;

        while(lt < len){
            rt = lt;
            char ch = str.charAt(lt);
            int cnt = 0;

            while(rt < len){
                char curCh = str.charAt(rt);
                if(ch != curCh) break;
                rt++;
                cnt++;
            }
            lt = rt;
            sb.append(ch);
            sb.append(cnt);
        }
        System.out.println(sb.length());
        System.out.println(sb);
    }

    // Run Length 인코딩 리팩토링
    // 123ms 10MB
    public static void runLengthEncoding2(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        int cnt = 1;

        char ch = str.charAt(0);
        for(int i = 1; i<len; i++){
            char curCh = str.charAt(i);
            if(ch == curCh){
                cnt++;
            }else{
                sb.append(ch);
                sb.append(cnt);
                ch = str.charAt(i);
                cnt = 1;
            }
        }

        sb.append(ch);
        sb.append(cnt);

        System.out.println(sb.length());
        System.out.println(sb);
    }
}
