package src.codingTest.search.linear;

public class FindNegativeNumber {

    static int findNegativeNumber(int[][] grid) {

        int result = 0;

        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] <0) result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {};
        findNegativeNumber(nums);
    }
}
