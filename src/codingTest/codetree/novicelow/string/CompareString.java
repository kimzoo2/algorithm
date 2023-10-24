package src.codingTest.codetree.novicelow.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
//        countMatches();
//        countString();
        countShifting();
    }

    public void countMatches(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = sc.next();
        int cnt = 0;

        for(int i = 0; i<a; i++){
            String compareString = sc.next();
            if(str.equals(compareString)) cnt++;
        }

        System.out.println(cnt);
    }

    //문자열의 개수
    //141ms 10MB
    public static void countString(){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        List<String> list = new ArrayList<>();
        while(true){
            String str = sc.next();
            list.add(str);
            if(!str.equals("0")) cnt++;
            else break;
        }
        System.out.println(cnt);
        for(int i = 0; i<cnt; i++){
            if(i % 2 == 0) System.out.println(list.get(i));
        }
    }

    // 오른쪽으로 미는 횟수
    // 143ms 10MB
    public static void countShifting(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String compareStr = sc.next();
        int cnt = 0;
        int len = str.length();

        for(int i = 0; i<len; i++){
            cnt++;
            str = str.substring(len-1) + str.substring(0,len-1);
            if(str.equals(compareStr)){
                System.out.println(cnt);
                break;
            }
            if(len-1 == i) System.out.println(-1);
        }
    }
}
