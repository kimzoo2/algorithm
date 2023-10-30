package src.codingTest.codetree.novicemid.function;

import java.util.Scanner;

public class VariableScope {
    static String org = "";
    static String tag = "";
    static int num;
    static int MAX_LEN = 100;
    static int[] array = new int[MAX_LEN];
    public static void main(String[] args) {
//        findWordsDriver();
//        calculateSequenceNumberDriver();
        sumOfRangeDriver();
    }

    // 함수를 이용한 부분 문자열의 위치 구하기
    // 148ms 10MB
    public static void findWordsDriver(){
        Scanner scanner = new Scanner(System.in);
        String origin = scanner.next();
        String target = scanner.next();
        org = origin;
        tag = target;
        // Indexof 사용하기
//        System.out.println(findWords(origin, target));
        System.out.println(notUseIndexOf());
    }

    // 나누고 빼면서 합하기
    public static void calculateSequenceNumberDriver(){
        Scanner sc = new Scanner(System.in);
        int aLen = sc.nextInt();
        num = sc.nextInt();
        int[] arr = new int[aLen+1];
        for (int i = 1; i <= aLen; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(calculateSequenceNumber(arr));
    }

    // 특정 구간의 합
    // 153ms 10MB
    public static void sumOfRangeDriver(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1; i<=n;i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sumOfRange(a,b);
        }
    }

    public static void sumOfRange(int a, int b){
        int result = 0;
        for (int i = a; i <=b; i++) {
            result += array[i];
        }
        System.out.println(result);
    }

    public static int calculateSequenceNumber(int[] arr){
        // 홀수면 1을 빼기
        // 짝수면 2를 나누기
        int result = 0;
        while(num >= 1){
            result += arr[num];
            if(num % 2 == 0){
                num /= 2;
            }else{
                num--;
            }
        }
        return result;
    }

    public static int findWords(String origin, String target){
        return origin.indexOf(target);
    }

    public static int notUseIndexOf(){
        int oLen = org.length();
        int tLen = tag.length();
        for(int i = 0; i<=oLen-tLen; i++){
            if(findWords2(i)){
                return i;
            };
        }
        return -1;
    }

    public static boolean findWords2(int i){
        int tLen = tag.length();
        for(int x = 0; x<tLen; x++){
            if(org.charAt(i) == tag.charAt(x)){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }

}
