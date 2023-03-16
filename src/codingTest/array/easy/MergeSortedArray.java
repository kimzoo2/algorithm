package src.codingTest.array.easy;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(true){
            if(i < m && (j == n || nums1[i] <= nums2[j])){
                arr[k] = nums1[i];
                i++;
            }else if (j < n && (i == m || nums2[j] < nums1[i])){
                arr[k] = nums2[j];
                j++;

            }
            k++;
            if(k == m+n) break;
        }

        nums1 = arr;

        System.out.println(Arrays.toString(nums1));

    }
    public static void main(String[] args) {

        MergeSortedArray ms = new MergeSortedArray();

        int[] arr1 = {1,2,3,0,0,0};
        int num = 3;
        int[] arr2 = {2,5,6};
        int num2 = 3;

        ms.merge(arr1, num, arr2, num2);
    }
}
