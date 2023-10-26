package src.codingTest.codetree.novicemid.function;

import java.util.Scanner;

public class ReturnFunction {

    public static void main(String[] args) {
//        game369();
//        isYearLeap();
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
}
