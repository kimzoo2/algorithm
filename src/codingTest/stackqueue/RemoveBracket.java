package src.codingTest.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracket {

    public String removeBracket(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        //(A(BC)D)EF(G(H)(IJ)K)LM(N)
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                stack.pop();
            }else{
                if(stack.isEmpty()) answer += ch;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String s = sc.next();

        RemoveBracket rb = new RemoveBracket();
        System.out.println(rb.removeBracket(s));

    }
}
