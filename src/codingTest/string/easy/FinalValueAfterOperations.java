package src.codingTest.string.easy;

public class FinalValueAfterOperations {

    static int finalValueAfterOperations(String[] operations) {
        int answer = 0;

        for(String str : operations){
            if(str.charAt(1) == '-'){ // minus
               answer--;
            }else{ // plus
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        String[] operations = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(operations));
    }
}
