package src.codingTest.codetree.novicelow.onearray;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
//        arrayGame();
//        consecutiveNumberSubSequence();
        thirdPoint();
    }

    // 특정 위치의 문자
    public static void findWord() {
        Scanner sc = new Scanner(System.in);
        char[] chars = {'L', 'E', 'B', 'R', 'O', 'S'};
        int idx = -1;

        char aChar = sc.next().charAt(0);

        for(int i = 0; i<chars.length; i++){
            if(chars[i] == aChar) idx = i;
        }

        System.out.println(idx == -1 ? "None" : idx);


    }

    // 배열 놀이
    public static void arrayGame() {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt(); // 원소의 개수
        int qLen = sc.nextInt(); // 질의의 수
        int[] elementArr = new int[len]; // 원소 배열
//        (1) 1 a (1 ≤ a ≤ n) a번째 원소를 출력합니다.
//        (2) 2 a (1 ≤ a ≤ 100) 숫자 a가 있는지를 판단합니다. 만약 있다면 해당 원소가 몇 번째 원소인지를 출력합니다. 숫자 a가 2개 이상 있다면 index가 더 작은 원소를 출력합니다. 만약 a가 없다면 0을 출력합니다.
//        (3) 3 a b (1 ≤ a ≤ b ≤ n) a번째 원소부터 b번째 원소까지 순서대로 공백을 사이에 두고 출력합니다.
        // q개의 질의에 대한 결과를 한 줄에 하나씩 출력함

        // 원소 담기
        for(int i = 0; i<len; i++){
            elementArr[i] = sc.nextInt();
        }

        for(int i = 0; i<qLen; i++){
            int questionType = sc.nextInt();
            int element1 = sc.nextInt();
            int idx = -1;
            int element2 = 0;
            if(questionType == 1) {
                System.out.print(elementArr[element1-1]);
            }else if(questionType == 2){
                for(int j = 0; j<len; j++){
                    if(element1 == elementArr[j]){
                        idx = j;
                        break;
                    }
                }
                if(idx == -1){
                    System.out.print(0);
                }else{
                    System.out.print(idx+1);
                }
//                System.out.print(idx == -1 ? 0 : idx+1);
            }else{
                element2 = sc.nextInt();
                for(int k = element1-1; k<=element2-1; k++){
                    System.out.print(elementArr[k] + " ");
                }
            }
            System.out.println();
        }
    }

    //연속부분수열일까
    public static void consecutiveNumberSubSequence(){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] aArr = new int[a];
        int[] bArr = new int[b];

        for(int i = 0; i<a; i++){
            aArr[i] = sc.nextInt();
        }
        for(int i = 0; i<b; i++){
            bArr[i] = sc.nextInt();
        }

        /*
        수열 B가 수열 A의 원소들을 연속하게 뽑았을 때 나올 수 있는 수열이라면 연속부분수열이라 부릅니다.
        예를 들어 수열 A가 [1, 5, 2, 6] 일때 수열 B가 [5, 2]라면 수열 B는 수열 A의 연속 부분 수열이지만, 만약 수열 B가 [5, 6]이라면 연속 부분 수열이 아닙니다.
        부분 수열이 맞다면 Yes 아니라면 No
        */

        // A1 == B1
        // A2 == B2
        // A3 != B3
        // A2 == B2
        int lt = 0;
        boolean isSame = false;

        while(lt <= a - b){
            int rt = lt;
            for(int i = 0; i<b; i++){
                if(aArr[rt] == bArr[i])isSame = true;
                else{
                    isSame = false;
                    break;
                }
                rt++;
            }
            if(isSame) break;
            lt++;
        }

        System.out.println(isSame ? "Yes" : "No");
    }

    // 2가 세번째로 등장하는 위치
    public static void thirdPoint(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            if(arr[i] == 2) cnt++;
            if(cnt == 3) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
