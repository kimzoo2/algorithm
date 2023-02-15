package src.codingTest.string.easy;

public class MostWordsFound {

    /**
     * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
     *
     * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
     *
     * Return the maximum number of words that appear in a single sentence.
     */
    static int mostWordsFound(String[] sentences) {
        int answer = 0;

        for(String str: sentences){
            int len = str.split(" ").length;
            if(answer < len) answer = len;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        // runtime = 3ms, memory = 41.8mb
        System.out.println(mostWordsFound(sentences));

    }
}
