package src.codingTest.codetree.novicemid.function;

import java.util.Scanner;

public class CallByValueORReference {
    public static void main(String[] args) {
//        isPalindromeDriver();
        twoNumberDriver();
    }

    // 두 정수 값 교환하기
    public static void swapDriver(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a,b);
    }

    private static void swap(int a, int b) {
        System.out.println(b + " " +  a);
    }

    // palindrome 여부 판단하기
    // 131ms 10MB
    public static void isPalindromeDriver(){
        Scanner sc = new Scanner(System.in);
        String originString = sc.next();
        System.out.println(isPalindrome(originString) ? "Yes" : "No");
    }

    private static boolean isPalindrome(String originString) {
        int len = originString.length();
        for (int i = 0; i < len; i++) {
            if(originString.charAt(i) != originString.charAt(len-i-1)) return false;
        }
        return true;
    }

    // 두 개 이상의 알파벳
    // 124ms 10MB
    public static void isTwoAlphabetDriver(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(isTwoAlphabet(str) ? "Yes" : "No");
    }

    public static boolean isTwoAlphabet(String str){
        int len = str.length();
        for(int i = 0; i<len; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return true;
        }
        return false;
    }

    // 두 정수에 대한 연산값2
    // 134ms 10MB
    public static void twoNumberDriver() {
        Scanner sc = new Scanner(System.in);
        // Integer는 불변 객체이기 때문에 사용불가
        // 배열이나 클래스 사용
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

//        a = sc.nextInt();
//        b = sc.nextInt();
        calculatorTwoNumber(a,b);
        System.out.println(a.value+ " " + b.value);
    }
    
    public static void calculatorTwoNumber(IntWrapper a, IntWrapper b) {
//        if(arr[0] < arr[1]){
//            arr[0] += 10;
//            arr[1] *= 2;
//        }else{
//            arr[1] += 10;
//            arr[0] *= 2;
//        }
//        return arr;

        if(a.value < b.value){
            a.value += 10;
            b.value *= 2;
        }else{
            a.value *= 2;
            b.value += 10;
        }
    }
}

class IntWrapper{
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}