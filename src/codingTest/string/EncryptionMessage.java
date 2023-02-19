package src.codingTest.string;

import java.util.Scanner;

public class EncryptionMessage {

    static int changeBinary(String str){
        String s = "";
        for(Character x : str.toCharArray()){
            if(x == '#') s += 1;
            else s += 0;
        }

        return Integer.parseInt(s, 2);
    }

    // 내가 푼 방법
    static String encryptionMessage(int n, String s){
        String answer = "";
        // #****### **#####* *#####** ##**
        // -> #****##
        for(int i = 0; i<n; i++){
            int len = s.length();
            String str = s.substring(0, 7);
            // -> 'C'
            answer += (char)(changeBinary(str));
            s = s.substring(7, len);
        }

        return answer;
    }

    // 강의에서 푼 방법
    static String encryptionMessageLecture(int n, String s){
        String answer = "";

        for(int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            answer += (char)Integer.parseInt(tmp, 2);
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.next();
        System.out.println(encryptionMessageLecture(input1, input2));
    }
}
