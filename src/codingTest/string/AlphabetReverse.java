package src.codingTest.string;

import java.util.Scanner;

public class AlphabetReverse {

    static String alphabetReverse(String str){
        String result = "";
        int lt = 0, rt = str.length()-1;
        char[] x = str.toCharArray();
        while(lt < rt){

            if(!Character.isAlphabetic(x[lt])){
                lt++;
            } else if (!Character.isAlphabetic(x[rt])){
                rt--;
            } else {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }

        }

        result = String.valueOf(x);

        return result;
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String str = in.next();
        System.out.println(alphabetReverse(str));
        return ;
    }
}
