package src.codingTest.string.easy;

public class GoalInterpret {

    static String interpret(String command) {
        String answer=  "";

        //runtime = 3ms, memory = 40.9mb
        //ßanswer = command.replace("()", "o").replaceAll("[()]", "");

        //runtiem = 1ms, memory = 40.3mb
        answer = command.replace("()", "o").replace("(al)","al");

        return answer;
    }

    public static void main(String[] args) {
        String command = "(al)G(al)()()G";

        System.out.println(interpret(command));

    }
}
