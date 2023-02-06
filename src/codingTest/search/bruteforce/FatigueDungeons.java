package src.codingTest.search.bruteforce;

public class FatigueDungeons {

    static void reSetSearch(boolean[] isSearch, int n){
        for(int i = 0; i<n; i++){
            isSearch[i] = false;
        }
    }

    static int maxNumber(int[] arr){
        int max = 0;

        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]) max = arr[i];
        }

        return max;
    }

    static void bruteForce(int[][] dungeons, boolean[] isSearch, int[] resultArr, int k, int x, int cnt){

        if(cnt == dungeons.length){
            return;
        }else{
            System.out.println("Test");
        }

        for (int i = 0; i<dungeons.length; i++){
            if(!(isSearch[i])){ // false일 때만 조건 탐색한다.
                if(dungeons[i][0] <= k){ // 필요도가 높은 경우
                    k -= dungeons[i][1]; // 전체 필요도 - 소모 필요도
                    isSearch[i] = true;
                    resultArr[x]++;
                    bruteForce(dungeons, isSearch, resultArr, k, x, cnt++);
                    isSearch[i] = false;
                }
            }
        }
    }

    static int solution(int k, int[][] dungeons) {
        int len = dungeons.length;
        int userFatigue = k;
        int cnt = 0;

        boolean[] isSearch = new boolean[len];
        int[] resultArr = new int[len];

        // 던전 피로도 조사 여부
        reSetSearch(isSearch, len);


        for(int i = 0; i<len; i++){
            k = userFatigue;
            reSetSearch(isSearch, len);

            if(dungeons[i][0] <= k){ // 필요도가 높은 경우
                 k -= dungeons[i][1]; // 전체 필요도 - 소모 필요도
                 isSearch[i] = true;
                 resultArr[i]++;
                 bruteForce(dungeons, isSearch, resultArr, k, i, cnt++);
            }
        }

        return maxNumber(resultArr);

    }

    public static void main(String[] args) {
        int k  = 80;
        int[][] dg = {{80,20},{50,40},{30,10}};

        System.out.println(solution(k, dg));
    }
}
