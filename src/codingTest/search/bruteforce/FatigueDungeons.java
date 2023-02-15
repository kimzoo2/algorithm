package src.codingTest.search.bruteforce;

public class FatigueDungeons {

    static int max = 0;

    static int bruteForce(int[][] dungeons, int depth, boolean[] visited, int k, int len, int x){

        if(depth == len){
            if(x > max) max = x;
            return x;
        }

        for (int i = 0; i<len; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                bruteForce(dungeons, depth+1, visited, k-dungeons[i][1], len, x+1);
                visited[i] = false;
            }

            if(x > max) max = x;
        }
        return x;
    }

    static int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        boolean[] visited = new boolean[dungeons.length];
        bruteForce(dungeons, 0, visited, k, len, 0);
        return max;

    }

    public static void main(String[] args) {
        int k  = 80;
        int[][] dg = {{80,20},{50,40},{30,10}};

        System.out.println(solution(k, dg));
    }
}
