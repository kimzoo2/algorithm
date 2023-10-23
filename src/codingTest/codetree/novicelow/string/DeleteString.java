package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class DeleteString {
    public static void main(String[] args) {
//        delete_characters_continuously();
        deleteE();
    }

    // 문자열 계속 지우기
    // 128ms 10MB
    public static void delete_characters_continuously(){

        //문자열 A와 문자열 B가 주어지면 문자열 A의 부분문자열 중 가장 앞에 등장하는 B와 같은 문자열을 찾아 지우려고 합니다.
        //지우고 난 후 떨어져있는 A의 문자열들을 다시 붙여 만들어진 새로운 문자열의 부분 문자열에 B가 없을 때까지 지우는 것을 반복합니다.
        //입력 예제
        //A:baabba
        //B:ab
        //출력 예제
        //ba

        //A, B 변수를 입력 받는다.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int bLen = b.length();

        //우선 무한 반복문을 돌린다.
        while(true){
            boolean isExists = false;
            int len = a.length();

            //A의 시작부터 끝까지 B가 있는지 확인한다.
            String result = "";

            for(int i = 0; i<=len-bLen; i++){
                //있으면 문자열을 수정한다.
                //없으면 다음으로 넘어간다.
                if(a.substring(i, i+bLen).equals(b)){
                    result = a.substring(0, i) +  a.substring(i+bLen, len);
                    a = result;
                    isExists = true;
                }
                len = a.length();
            }

            //A의 끝까지 변경되는 부분이 없으면 완료한다.
            if(isExists == false) break;
        }
        //A를 프린트한다.
        System.out.println(a);
    }

    // e 제거하기
    public static void deleteE(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        for(int i = 0; i<len; i++){
            if(str.charAt(i) == 'e'){
                str = str.substring(0, i) + str.substring(i+1);
                break;
            }
        }

        System.out.println(str);
    }
}
