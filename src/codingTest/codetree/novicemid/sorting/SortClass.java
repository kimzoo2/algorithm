package src.codingTest.codetree.novicemid.sorting;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class SortClass {

    public static void main(String[] args) throws IOException {
//        sortHeight();
//        sortScore();
//        sortSumScore();
//        lineUp();
//        privateInformation();
//        sortBodyInformation();
        distanceStartPoint();
    }

    // 키를 기준으로 정렬
    // lambda 230ms 14MB
    // 객체에 Comparable 구현 95ms 8MB
    public static void sortHeight() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Person[] people = new Person[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            people[i] = new Person(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
        }

        // 230ms 14MB
//        Arrays.sort(people, (a,b) -> a.getHeight() - b.getHeight());
        // 95ms 8MB
        Arrays.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }

    // 국영수 비교
    // 112ms 8MB
    public static void sortScore() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StudentScore[] studentScores = new StudentScore[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            studentScores[i] = new StudentScore(strings[0], Integer.parseInt(strings[1]),
                    Integer.parseInt(strings[2]), Integer.parseInt(strings[3]));
        }

        Arrays.sort(studentScores);

        for (StudentScore studentScore : studentScores) {
            System.out.println(studentScore);
        }
    }

    // 총점수 비교
    // 81ms 8MB
    public static void sortSumScore() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StudentScore[] studentScores = new StudentScore[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            studentScores[i] = new StudentScore(strings[0], Integer.parseInt(strings[1]),
                    Integer.parseInt(strings[2]), Integer.parseInt(strings[3]));
        }

        Arrays.sort(studentScores, new Comparator<StudentScore>() {
            @Override
            public int compare(StudentScore o1, StudentScore o2) {
                return o1.sumScore() - o2.sumScore();
            }
        });

        for (StudentScore studentScore : studentScores) {
            System.out.println(studentScore);
        }
    }

    // 줄 세우기
    // 148ms 10MB
    public static void lineUp() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StudentHealthInformation[] students = new StudentHealthInformation[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            students[i] = new StudentHealthInformation(Integer.parseInt(strings[0]),
                    Integer.parseInt(strings[1]), i+1);
        }

        Arrays.sort(students);

        for (StudentHealthInformation student : students) {
            System.out.println(student);
        }
    }

    // 개인정보
    // 159ms 9MB
    public static void privateInformation() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        UserHealthInformation[] userList = new UserHealthInformation[5];
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            userList[i] = new UserHealthInformation(strings[0],
                    Integer.parseInt(strings[1]), Float.parseFloat(strings[2]));
        }

        Arrays.sort(userList, new Comparator<UserHealthInformation>() {
            @Override
            public int compare(UserHealthInformation o1, UserHealthInformation o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("name");
        for (UserHealthInformation userHealthInformation : userList) {
            System.out.println(userHealthInformation);
        }

        System.out.println();

        Arrays.sort(userList, new Comparator<UserHealthInformation>() {
            @Override
            public int compare(UserHealthInformation o1, UserHealthInformation o2) {
                return o2.getHeight() - o1.getHeight();
            }
        });

        System.out.println("height");
        for (UserHealthInformation userHealthInformation : userList) {
            System.out.println(userHealthInformation);
        }
    }

    // 키 몸무게를 기준으로 정렬
    // 88ms 8MB
    public static void sortBodyInformation() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        UserHealthInformation2[] userList = new UserHealthInformation2[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            userList[i] = new UserHealthInformation2(strings[0],
                    Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
        }

        Arrays.sort(userList);

        for (UserHealthInformation2 userHealthInformation2 : userList) {
            System.out.println(userHealthInformation2);
        }
    }

    // 원점으로부터의 거리
    // 147ms 10MB
    public static void distanceStartPoint() throws IOException {
        //2차 평면 위에 N개의 점이 주어졌을 때, 원점에서 가까운 점부터 순서대로 번호를 출력하는 프로그램을 작성해보세요
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        TwoDimensionalPlane[] userList = new TwoDimensionalPlane[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] strings = str.split(" ");
            userList[i] = new TwoDimensionalPlane(Integer.parseInt(strings[0]),
                    Integer.parseInt(strings[1]), i+1);
        }

        Arrays.sort(userList);

        for (TwoDimensionalPlane user : userList) {
            System.out.println(user.getRank());
        }
    }
}

class TwoDimensionalPlane implements Comparable<TwoDimensionalPlane>{
    private int x;
    private int y;
    private int rank;

    public TwoDimensionalPlane(int x, int y, int rank) {
        this.x = x;
        this.y = y;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public int calculateDistance(){
        return Math.abs(x)+Math.abs(y);
    }

    @Override
    public int compareTo(TwoDimensionalPlane o) {
        if(this.calculateDistance() != o.calculateDistance()){
            return this.calculateDistance() - o.calculateDistance();
        }
        return this.rank - o.rank;
    }
}

class UserHealthInformation2 implements Comparable<UserHealthInformation2>{
    private String name;
    private int height;
    private int weight;

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public UserHealthInformation2(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }

    @Override
    public int compareTo(UserHealthInformation2 o) {
        if(this.height != o.height){
            return this.height - o.height;
        }
        return o.weight - this.weight;
    }
}

class UserHealthInformation {
    private String name;
    private int height;
    private float weight;

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public UserHealthInformation(String name, int height, float weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}

class StudentHealthInformation implements Comparable<StudentHealthInformation>{
    private int height;
    private int weight;
    private int rank;

    public StudentHealthInformation(int height, int weight, int rank) {
        this.height = height;
        this.weight = weight;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return height + " " + weight + " " + rank;
    }

    @Override
    public int compareTo(StudentHealthInformation o) {
        if(this.height != o.height){
            return o.height - this.height;
        }
        if(this.weight != o.weight){
            return o.weight - this.weight;
        }
        return this.rank - o.rank;
    }
}

class StudentScore implements Comparable<StudentScore>{
    private String name;
    private int kor;
    private int math;
    private int eng;

    public StudentScore(String name, int kor, int math, int eng) {
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
    }

    public int sumScore(){
        return this.kor + this.math + this.eng;
    }

    @Override
    public int compareTo(StudentScore o) {
        if(this.kor == o.kor){
            if(this.math == o.math){
                return o.eng - this.eng;
            }else{
                return o.math - this.math;
            }
        }

        return o.kor - this.kor;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + math + " " + eng;
    }
}

class Person implements Comparable<Person>{
    private String name;
    private int height;
    private int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Person person){
        return this.height - person.height;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}