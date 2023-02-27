package src.codingTest.array.easy;

public class FindMaxConsecutiveOnes {

    static int findMaxConsecutiveOnes(int[] nums){
        int answer = 0;
        int cnt = 0;
        for(int num : nums){
            if(num == 1)
                cnt++;
            else {
                answer = Math.max(answer, cnt);
                cnt = 0;
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,0,1,1,1};

        findMaxConsecutiveOnes(arr);

    }
}
