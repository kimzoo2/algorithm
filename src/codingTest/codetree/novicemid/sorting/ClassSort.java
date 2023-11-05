package src.codingTest.codetree.novicemid.sorting;

import java.io.*;

public class ClassSort {
    public static void main(String[] args) throws IOException {
        secretUnion();
    }

    static class SecretAgent {
        String code;
        String meetingPoint;
        String time;

        public SecretAgent(String code, String meetingPoint, String time) {
            this.code = code;
            this.meetingPoint = meetingPoint;
            this.time = time;
        }

        @Override
        public String toString() {
            return "secret code : " + code + "\n" +
                    "meeting point : " + meetingPoint + "\n" +
                    "time : " + time;
        }
    }

    // 007
    // 99ms 8MB
    public static void secretUnion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");

        SecretAgent secretAgent = new SecretAgent(split[0], split[1], split[2]);
        System.out.println(secretAgent);
    }
}
