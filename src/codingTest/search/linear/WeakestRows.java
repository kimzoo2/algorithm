package src.codingTest.search.linear;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WeakestRows {

    static int[] kWeakestRows(int[][] mat, int k) {

        int count = 0;
        int[][] temp = new int[mat.length][2];
        int[] result = new int[k];

        for (int i = 0; i< mat.length; i++){
            count = 0;
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j] == 1) {
                    count++;
                }
            }
            temp[i][0] = i;
            temp[i][1] = count;
        }

        Arrays.sort(temp, Comparator.comparingInt(o1 -> o1[1]));

        for (int i = 0; i<k; i++){
            result[i] = temp[i][0];
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,0},
                        {0,0},
                        {1,0}};
//                        {1,1,0,0,0},
//                        {1,1,1,1,1}};
        int k = 2;

        System.out.println(Arrays.toString(kWeakestRows(nums, k)));
    }
}
