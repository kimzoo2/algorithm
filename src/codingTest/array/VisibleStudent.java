package src.codingTest.array;

import java.util.Scanner;

public class VisibleStudent {

    // 내가 푼 방법 time = 701ms / memory = 34MB
    static int visibleStudent(int n, int[] students){
        int answer = 0;
        int height = 0;

        for(int student : students){
            if(student > height) {
                answer++;
                height = student;
            }
        }

        return answer;
    }

    // 강의에서 푼 방법 time = 777ms / memory = 34MB
    static int visibleStudentLecture(int n, int[] students){
        int answer = 1, max=students[0];
        for(int i=1; i<n; i++){
            if(students[i] > max) {
                answer++;
                max = students[i];
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] input2 = new int[input1];
        for(int i = 0; i<input1; i++){
            input2[i] = in.nextInt();
        }
        System.out.println(visibleStudent(input1, input2));
        System.out.println(visibleStudentLecture(input1, input2));
    }
}
