package src.codingTest.array.easy;


public class DuplicateZeros {

    static void duplicateZeros(int[] arr){
        int len = arr.length;
        int[] tmp= new int[len];
        int ix = 0;

        for(int num : arr){
            tmp[ix] = num;

            if(num == 0){
                ix++;
                if(ix == len) break;
                tmp[ix] =0;
            }
            ix++;

            if(ix == len) break;
        }

        arr = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);

    }
}
