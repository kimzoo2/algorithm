package src.codingTest.codetree.novicelow.string;

import java.util.Scanner;

public class StringToInt {

    public static void main(String[] args) {
//        extractInt();
        deleteAlphabet();
    }

    public static void extractInt(){
        Scanner sc =new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(findNumber(a) +  findNumber(b));
    }

    public static void deleteAlphabet(){
        Scanner sc =new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(findNumber(a) + findNumber(b));
    }

    public static int findNumber(String a){
        String number = "";
        int len = a.length();
        for(int i =0; i<len; i++){
            int num = a.charAt(i)-'0';
            if(num >= 0 && num <= 9)
                number += a.charAt(i);
//            else break;
        }
        return Integer.parseInt(number);
    }
}
