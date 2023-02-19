package src.codingTest.array.easy;

import java.util.Arrays;

public class GetConcatenation {

    static int[] getConcatenation(int[] nums) {
        int len =nums.length;
        int[] answer = new int[len *2];

        for(int i = 0; i<len; i++){
            answer[i] = nums[i];
            answer[i+len] = nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
