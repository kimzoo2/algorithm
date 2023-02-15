package src.codingTest.string;

import java.util.Scanner;

public class ExtractNumber {

    static int extractNumber(String s){

        // solve replaceAll
//        s = s.replaceAll("[^0-9]", "");
//        return Integer.parseInt(s);

        // solve asc number
//        int answer = 0;
//        for(char x : s.toCharArray()){
//            if(x >= 48 && x <= 57) answer = answer * 10+(x-48);
//        }

        // solve isDigit
        String answer = "";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer +=x;
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(extractNumber(input1));
    }
}
