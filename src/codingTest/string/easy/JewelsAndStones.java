package src.codingTest.string.easy;

public class JewelsAndStones {

    static int numJewelsInStones(String jewels, String stones) {
        int answer = 0;
        for(char jewel : jewels.toCharArray()){
            for(char stone : stones.toCharArray()){
                if(jewel == stone) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String j = "";
        String s = "";

        numJewelsInStones(j, s);
    }
}
