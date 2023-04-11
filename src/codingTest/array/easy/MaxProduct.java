package src.codingTest.array.easy;

public class MaxProduct {


    public String duplicatedString(String str){
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    // 284ms / 46.6MB
    public int maxProduct(String[] words) {
        int answer = 0;
        int len = words.length;

        String[] tmp = new String[len];

        // 중복제거
        for(int i = 0; i<len; i++){
            tmp[i] = duplicatedString(words[i]);
        }

        for(int i = 0; i<len-1; i++){
            for(int j = i+1; j<len; j++){
                int lt = 0;
                while(lt <tmp[i].length()){
                    String str = Character.toString(tmp[i].charAt(lt));
                    if(tmp[j].indexOf(str) > -1){ // 존재할 때
                        break;
                    }
                    lt++;
                }

                if(lt == tmp[i].length()){ // 같지 않을 때
                    answer = Math.max(answer, words[i].length() * words[j].length());
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        // 318. Maximum Product of Word Lengths
        // Given a string array words, return the maximum value of length(word[i]) * length(word[j])
        // where the two words do not share common letters. If no such two words exist, return 0.
        MaxProduct mp = new MaxProduct();
        String[] words = {"fcf","cefde","dabae"};
        mp.maxProduct(words);

    }
}
