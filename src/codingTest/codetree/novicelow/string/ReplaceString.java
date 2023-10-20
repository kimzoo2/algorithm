package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class ReplaceString {

    public static void main(String[] args) {
//        updateString();
//        playString();
        changeString();
    }

    public static void updateString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int len = str.length();

        char[] chars = str.toCharArray();

        chars[1] = chars[len-2] = 'a';

        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }

    //문자열 놀이
    public static void playString(){
        // 문자열 s와 q개의 질의가 주어졌을 때 각 질의를 수행하는 프로그램을 작성해보세요. 단, 질의를 순서대로 수행해야 하며, 문자열은 질의에 따라 계속 변합니다. 질의의 종류는 다음과 같습니다.
        //1 a b
        //a번째 문자와 b번째 문자를 교환한 뒤 출력합니다.
        //2 a b
        //문자 a를 전부 문자 b로 변경한 뒤 출력합니다.

        //input
        //aba 2
        //1 1 2
        //2 a c

        //output
        //baa
        //bcc

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int cnt = sc.nextInt();
        char[] charArr = str.toCharArray();

        for(int i = 0; i<cnt; i++){
            int firstQuestion = sc.nextInt();
            if(firstQuestion == 1){
                int second = sc.nextInt()-1;
                int third = sc.nextInt()-1;
                char tmp = charArr[second];
                charArr[second] = charArr[third];
                charArr[third] = tmp;
                System.out.println(String.copyValueOf(charArr));
            }else{
                char bfCh = sc.next().charAt(0);
                char afCh = sc.next().charAt(0);
                for(int j = 0; j<len; j++){
                    if(charArr[j] == bfCh) charArr[j] = afCh;
                }
                System.out.println(String.copyValueOf(charArr));
            }
        }
    }

    // 두 번째를 첫 번째로
    // 118ms 100MB
    public static void changeString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.replaceAll(String.valueOf(str.charAt(1)), String.valueOf(str.charAt(0))));
    }
}
