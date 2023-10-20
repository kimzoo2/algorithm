package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
//        isExist();
//        indexOf();
        indexOf2();
    }

    // 특정 문자의 유무
    public static void isExist(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        boolean exist1 = false;
        boolean exist2 = false;

        for(int i = 0; i<len-1; i++){
            if(a.substring(i, i+2).equals("ee")) exist1 = true;

            if(a.substring(i, i+2).equals("ab")) exist2 = true;
        }
        System.out.println((exist1 ? "Yes" : "No") + " " + (exist2 ? "Yes" : "No"));
    }

    //부분문자열 위치 구하기
    // 138ms 10MB
    public static void indexOf(){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();
        int len = input.length();
        int tLen = target.length();
        int index = -1;

        for(int i = 0; i<=len-tLen; i++){
            if(input.substring(i, i+tLen).equals(target)){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }

    //부분문자열 개수
    //120ms 10MB
    public static void indexOf2(){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();
        int iLen = input.length();
        int tLen = target.length();
        int cnt = 0;

        for(int i = 0; i<=iLen-tLen; i++){
            boolean isExist = true;
            for(int j = 0; j<tLen; j++){
                if(input.charAt(i+j) != target.charAt(j)){
                    isExist = false;
                    break;
                }
            }

            if(isExist) cnt++;
        }

        System.out.println(cnt);
    }
}
