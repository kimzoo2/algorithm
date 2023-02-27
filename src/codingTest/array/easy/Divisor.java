package src.codingTest.array.easy;

public class Divisor {

    static int isPrime(int num){
        int cnt = 0;
        for(int i = 1; i<=num; i++){
            if(num % i == 0) cnt++;
        }
        return cnt;
    }

    static int solution(int left, int right) {
        int answer = 0;

        // 약수의 개수가 짝인 수는 +
        // 약수의 개수가 홀수인 수는 -
        for(int i = left; i<=right; i++){
            if(isPrime(i) % 2 == 0)
                answer += i;
            else answer -= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int num = 13;
        int num2 = 17;
        System.out.println(solution(num, num2));
    }
}
