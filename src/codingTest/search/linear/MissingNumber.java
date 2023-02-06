package src.codingTest.search.linear;

import java.util.Arrays;

public class MissingNumber {

    static int missingNumber(int[] nums) {
//        int i = 0;
//
//        Arrays.sort(nums);
//
//        while(i == nums[i]){
//            i++;
//        }
//
//        return i;

        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res ^= i;
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num = {3,0,1,4,5,6};

        System.out.println(missingNumber(num));

    }
}
