package src.codingTest.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

    static ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
/*
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            // String은 문자열을 변경할 수 없기 때문에
            // 새로운 객체를 생성해서 만드는건데
            // StringBuilder는 처음에 만든 객체를 사용함

            answer.add(tmp);
        }
*/
        for(String x : str){
            char[] s = x.toCharArray(); // good -> g o o d
            int lt = 0, rt = x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s); // valueOf는 static method
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i<n; i++){
            str[i] = sc.next();
        }

        for(String x : solution(n, str)){
            System.out.println(x);
        }
    }
}
