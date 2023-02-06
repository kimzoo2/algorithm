package src.codingTest.search.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionArray {
    static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums1.length; i++){
            for (int j = 0; j<nums2.length; j++){
                if(nums1[i] == nums2[j] &&
                        !list.contains(nums2[j])){
                    list.add(nums1[i]);
                }
            }
        }


        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static void main(String[] args) {
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(num1, num2)));

    }
}
