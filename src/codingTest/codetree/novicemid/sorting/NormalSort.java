package src.codingTest.codetree.novicemid.sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class NormalSort {
    public static void main(String[] args) throws IOException {
//        ascDescSort();
//        sortString();
//        findTopK();
//        compareArray();
        grouping();
    }

    // 오름 내림차순 정렬
    // 221ms 15MB
    public static void ascDescSort() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];
        String str = br.readLine();
        String[] strArr = str.split(" ");
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        ascDescSort(arr);
    }

    public static void ascDescSort(int[] arr) {
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // intArray -> IntegerArray
        // 근데 스트림 사용해서 속도 저하가 발생함..
        Integer[] newArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(newArr, Collections.reverseOrder());

        for (Integer integer : newArr) {
            System.out.print(integer + " ");
        }
    }

    // 문자열 정렬
    // 88ms 8MB
    public static void sortString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String s = new String(charArray);
//        String s = String.valueOf(charArray);
        System.out.println(s);
    }

    // 문자열 리스트 정렬
    // 116ms 9MB
    public static void sortStringArray() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] strArr = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            strArr[i] = br.readLine();
        }

        Arrays.sort(strArr);

        for (String s : strArr) {
            System.out.println(s);
        }
    }

    // top k 구하기
    // 92ms 9MB
    public static void findTopK() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 카운트와 타겟 인덱스를 저장한다.
        String cntStr = br.readLine();
        String[] cntStrARr = cntStr.split(" ");
        int cnt = Integer.parseInt(cntStrARr[0]);
        int target = Integer.parseInt(cntStrARr[1]);

        // 배열을 찾는다.
        String str = br.readLine();
        String[] strArr = str.split(" ");
        int[] arr = new int[cnt+1];
        for (int i = 1; i <= cnt; i++) {
            arr[i] = Integer.parseInt(strArr[i-1]);
        }
        // arr을 정렬한다.
        Arrays.sort(arr);

        // target index를 출력한다.
        System.out.println(arr[target]);
    }

    public static int cnt;
    // 두 개의 동일한 수열
    // 110ms 8MB
    public static void compareArray() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cnt = Integer.parseInt(br.readLine());

        // 첫번째 수열
        String str1 = br.readLine();
        String[] strArr1 = str1.split(" ");
        Arrays.sort(strArr1);

        String str2 = br.readLine();
        String[] strArr2 = str2.split(" ");
        Arrays.sort(strArr2);

        System.out.println(compareArray(strArr1, strArr2) ? "Yes" : "No");
    }

    public static boolean compareArray(String[] arr, String[] compareArr){
        for (int i = 0; i < cnt; i++) {
            if(!arr[i].equals(compareArr[i])) return false;
        }
        return true;
    }
    static int minValue = 1;

    // 2개씩 그룹짓기
    // 112ms 9MB
    public static void grouping() throws IOException {

        // 겹치지 않으면서 2개의 원소가 하나의 그룹을 이루도록 하여 총 N개의 그룹을 만들기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] arr = str.split(" ");
        int len = arr.length;
        int[] intArr = new int[len];
        for (int i = 0; i < len; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);
        int result = minValue;

        for (int i = 0; i < cnt; i++) {
            result = Math.max(result, intArr[i] + intArr[len - i - 1]);
        }
        System.out.println(result);
    }

}
