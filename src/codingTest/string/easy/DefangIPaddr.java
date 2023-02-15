package src.codingTest.string.easy;

public class DefangIPaddr {

    static String defangIPaddr(String address){
//        String answer = "";

        //2ms
//        answer = address.replaceAll("[.]", "[.]");

        //5ms
        /*
        for(char c : address.toCharArray()){
            if(c == '.') answer += "[.]";
            else answer += c;
        }*/


        //return answer;

        // 0ms
        return address.replace(".", "[.]");
    }


    public static void main(String[] args) {

        String str = "1.1.1.1";
        defangIPaddr(str);

    }
}
