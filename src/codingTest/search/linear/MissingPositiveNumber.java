package src.codingTest.search.linear;

public class MissingPositiveNumber {

    static int findKthPositive(int[] arr, int k) {
        int i = 0;
        int j = 0;
        int result= 0 ;

        while(k > 0){
            i++;

            if(j < arr.length) {
                if (i == arr[j]) {
                    j++;
                    result--;
                }
            }

            if(++result == k) break;
        }

        return i;
    }

    public static void main(String[] args) {
        int [] nums = {2,3,4,7,11};
        int k = 5;

        System.out.println(findKthPositive(nums, k));
    }
}
