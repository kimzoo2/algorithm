package src.codingTest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectBracket {

    public String correctBracket(String str){

//        (()(()))(()
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }

        if(!stack.isEmpty()) answer ="NO";

        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        CorrectBracket cb = new CorrectBracket();

        cb.correctBracket(str);

        System.out.println(cb.correctBracket(str));

    }
}
