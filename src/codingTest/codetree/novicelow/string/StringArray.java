package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {
//        reversePrint();
//        specificEnd();
        startWithSpecificWord();
    }

    //문자열 역순으로 출력하기
    public static void reversePrint() {
        Scanner sc= new Scanner(System.in);
        int len = 4;
        String[] strArr = new String[len];

        for(int i = 0; i<len; i++){
            strArr[i] = sc.next();
        }

        for(int i=len-1; i>=0; i--){
            System.out.println(strArr[i]);
        }
    }

    //특정 문자로 끝나는 문자열
    public static void specificEnd() {
        Scanner sc = new Scanner(System.in);
        int len = 10;
        String[] str = new String[len];

        for(int i = 0; i<len; i++){
            str[i] = sc.next();
        }

        char ch = sc.next().charAt(0);
        boolean result = false;

        for (String s : str) {
            int strLen = s.length();

            if(s.charAt(strLen-1) == ch){
                System.out.println(s);
                result = true;
            }
        }

        if(result == false)
            System.out.println("None");
    }

    // 특정 문자로 시작하는 문자열
    public static void startWithSpecificWord(){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] strArr = new String[len];
        int cnt = 0;
        int sumSize = 0;

        for (int i = 0; i < len; i++) {
            strArr[i] = sc.next();
        }
        char ch = sc.next().charAt(0);

        for (String s : strArr) {
            if(s.charAt(0) == ch){
                cnt++;
                sumSize += s.length();
            }
        }

        System.out.printf("%d %.2f", cnt, (float)sumSize/cnt);


    }
}
