package src.codingTest.string.easy;

public class Reverse3 {

    static int solution(int n) {
        int answer = 0;

        //n (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
        // 10진법 => 3진법 => 거꾸로
        StringBuilder sb = new StringBuilder(Integer.toString(n, 3)).reverse();

        // 거꾸로 3진법 => 10진법
        answer = Integer.parseInt(String.valueOf(sb), 3);
        return answer;
    }

    public static void main(String[] args) {

        int n = 45;
        System.out.println(solution(n));

    }
}
