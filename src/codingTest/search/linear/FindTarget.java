package src.codingTest.search.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTarget {

//    static int[] sortArray(int[] nums){
//
//        Arrays.sort(nums);
//
////        for(int i = 0; i<nums.length; i++){
////            while(true){
////                int afNum = nums[i+1];
////                if(nums[i] > afNum){
////                    nums[i+1] = nums[i];
////
////                }
////            }
////        }
//
//
//    }

    static List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 5;
        targetIndices(nums, target);
    }
}
