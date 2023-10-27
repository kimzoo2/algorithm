package src.codingTest.codetree.novicemid.function;

import java.util.Scanner;

public class ReturnFunction {

    public static void main(String[] args) {
//        game369();
//        isYearLeap();
//        calculator();
//        prime();
//        sequenceNumber();
        isDatePresent();
    }

    public static int sumNumber(int number){
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result/10;
    }

    // 1부터 특정 수까지의 합
    public static void calculateNumber(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumNumber(num));
    }

    // 함수를 이용한 369게임
    public static void game369(){
        //정수 a와 b가 주어지면, a이상 b이하 수들 중 3, 6, 9 중에 하나가 들어가 있거나
        //그 숫자 자체가 3의 배수인 숫자의 개수를 세는 프로그램을 작성
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for(int i =a; i<=b; i++){
            if(isMagicNumber(i)){
               cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isMagicNumber(int num){
        return num % 3 == 0 || isSame(num);
    }

    public static boolean isSame(int num){
        return String.valueOf(num).contains("3") ||
                String.valueOf(num).contains("6") ||
                String.valueOf(num).contains("9");
    }

    //윤년 판별
    public static void isYearLeap(){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year){
        // 4의 배수이면 윤년
        // 100의 배수라면 윤년 아님
        // 400의 배수라면 윤년
        if(year % 400 == 0) return true;
        if(year % 100 == 0) return false;
        if(year % 4 == 0) return true;
        return false;
    }

    // 사칙연산 함수
    // 191ms 10MB
    public static void calculator(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String str = sc.next();
        int y = sc.nextInt();
        int result = 0;

        switch (str.charAt(0)){
            case('+') : result = add(x,y); break;
            case('-') : result = minus(x,y); break;
            case('*') : result = multiple(x,y); break;
            case('/') : result = divide(x,y); break;
            default:
                System.out.println("False"); return;
        }

        System.out.println(x + " " + str + " " + y + " = " + result);
    }

    public static int add(int x, int y){
        return x+y;
    }

    public static int minus(int x, int y){
        return x-y;
    }

    public static int multiple(int x, int y){
        return x*y;
    }

    public static int divide(int x, int y){
        return x/y;
    }

    // 함수를 이용한 합과 소수 판별
    // 119ms 10MB
    public static void prime(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int primeCnt = 0;
        for (int i = a; i <= b; i++) {
            if(isPrime(i) && isEven(i)) {
                primeCnt++;
            }
        }
        System.out.println(primeCnt);
    }

    public static boolean isPrime(int num){
        if(num == 1) return false;

        for(int i = 2; i<num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int num){
        int result = 0;
        while(num > 0){
            result += num % 10;
            num /= 10;
        }
        return result % 2 == 0;
    }

    // 함수를 이용한 연속부분수열 여부 판단하기
    // 134ms 10MB
    public static void sequenceNumber(){
        Scanner sc = new Scanner(System.in);
        int aLen = sc.nextInt();
        int bLen = sc.nextInt();
        int[] aArr = new int[aLen];
        int[] bArr = new int[bLen];

        for(int i = 0; i<aLen; i++){
            aArr[i] = sc.nextInt();
        }
        for(int i = 0; i<bLen; i++){
            bArr[i] = sc.nextInt();
        }
        System.out.println(isSequence(aLen, bLen, aArr, bArr) ? "Yes" : "No");
    }

    public static boolean isSequence(int aLen, int bLen, int[] aArr, int[] bArr){
        int ot = 0;
        int lt = 0;
        int rt = 0;

        while(ot<=aLen-bLen){
            if(rt >= bLen) return true;
            if(aArr[lt] == bArr[rt]){
                lt++;
                rt++;
            }else{
                rt = 0;
                lt = ++ot;
            }
        }
        return false;
    }

    // 2021년 날짜의 유무
    public static void isDatePresent(){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.println(isExist(month, day) ? "Yes" : "No");
    }

    public static boolean isExist(int month, int day){
        if(month <= 12 && day <= lastDay(month)) return true;
        return false;
    }

    public static int lastDay(int month){
        if(month == 2) return 28;
        else if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        return 31;
    }
}
