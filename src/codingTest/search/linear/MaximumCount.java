package src.codingTest.search.linear;

public class MaximumCount {

    static int maximumCount(int[] nums) {
        int positiveCount = 0;
        int negativeCount = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] >0 ) positiveCount++;
           else if(nums[i] < 0) negativeCount++;
        }


        return positiveCount > negativeCount ? positiveCount : negativeCount;
    }

    public static void main(String[] args) {
        int [] nums = {-2,-1,-1,1,2,3};
        //maximumCount(nums);
        System.out.println(maximumCount(nums));
    }
}
