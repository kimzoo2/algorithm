package src.codingTest.array;
import java.util.*;

public class GetPeak {
    int[] dx={-1, 0, 1, 0};
    int[] dy={0, 1, 0, -1};

    static boolean isPeak(int n, int[][] arr, int x, int y){
        int number = arr[x][y];

        if(arr[x-1][y] >= number) return false;
        if(arr[x+1][y] >= number) return false;
        if(arr[x][y-1] >= number) return false;
        return arr[x][y + 1] < number;
    }

    static int getPeak(int n, int[][] arr){
        int answer = 0;

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<n+1; j++){
                if(isPeak(n, arr, i, j))
                    answer++;
            }
        }

        return answer;
    }

    public int getPeakLecture(int n, int[][] arr){
        int answer = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx >=0 && nx<n && nx>=0 && ny<n && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] binaryArr = new int[n+2][n+2];

        for(int i = 1; i<n+1; i++){
            for(int j = 1; j<n+1; j++){
                binaryArr[i][j] = sc.nextInt();
            }
        }
        GetPeak T = new GetPeak();

        System.out.println(T.getPeakLecture(n, binaryArr));
    }
}
