package src.codingTest.string.easy;

import java.util.*;

public class RestoreString {

    static String restoreString(String s, int[] indices) {
        char[] chArray = new char[indices.length];
        for (int i=0;i<indices.length;i++)
            chArray[indices[i]] = s.charAt(i);
        return new String(chArray);
    }

    static String restoreString1(String s, int[] indices) {
        String answer = "";
        Map<Integer, Character> map = new HashMap<>();

        // map에 단어와 index 넣기
        for(int i =0 ; i<indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());

        // 키 값으로 오름차순 정렬
        Collections.sort(keySet);

        for (Integer idx : keySet) {
            answer += map.get(idx);
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        // runtime = 6ms, memory = 42.9mb
        System.out.println(restoreString1(s, indices));

        //
        System.out.println(restoreString1(s, indices));
    }
}
