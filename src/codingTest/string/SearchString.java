package src.codingTest.string;

import java.util.Locale;
import java.util.Scanner;

public class SearchString {

    static int solution(String str, char c){

        int answer = 0;

        str = str.toUpperCase(Locale.ROOT);
        c = Character.toUpperCase(c);

        System.out.println(str + " " + c);
        /*
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == c) answer++;
        }
        */

        for(char x : str.toCharArray()){
            if(x == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(str, c));

    }
}
