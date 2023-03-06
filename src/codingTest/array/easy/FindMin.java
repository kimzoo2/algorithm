package src.codingTest.array.easy;

import java.util.Arrays;

public class FindMin {

    static int solution(int []A, int []B)
    {
        int sum = 0;
        int ix = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int Alen = A.length;
        int Blen = B.length;

//        테스트 1 〉	통과 (1.56ms, 52.1MB)
//        테스트 2 〉	통과 (1.41ms, 51.9MB)
//        테스트 3 〉	통과 (1.39ms, 52.2MB)
//        테스트 4 〉	통과 (2.04ms, 52.5MB)
        while(ix < Alen){
            sum += A[ix] * B[Blen-ix-1];
            ix++;
        }

//        테스트 1 〉	통과 (1.31ms, 52.3MB)
//        테스트 2 〉	통과 (1.38ms, 52.6MB)
//        테스트 3 〉	통과 (1.49ms, 52MB)
//        테스트 4 〉	통과 (0.98ms, 53.1MB)
        for(int i = 0; i<Alen; i++){
            sum += A[i] * B[Blen-i-1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};

        System.out.println(solution(a, b));
    }
}
