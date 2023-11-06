package src.codingTest.codetree.novicemid.sorting;

import java.io.*;
import java.util.Arrays;

public class ClassSort {
    public static void main(String[] args) throws IOException {
//        secretUnion();
//        nextLevel();
//        codeName();
//        defuseBomb();
//        productCode();
//        livingLocation();
        rainyDay();
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

    // NextLevel
    // 86ms 8MB
    public static void nextLevel() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");

        User user = new User();
        System.out.println(user.toString());
        User user1 = new User(split[0], Integer.parseInt(split[1]));
        System.out.println(user1);
    }

    // 코드 네임
    // 91ms 8MB
    public static void codeName() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Agent[] agents = new Agent[5];
        for (int i = 0; i < 5; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            agents[i] = new Agent(split[0], Integer.parseInt(split[1]));
        }
        int idx = 0;
        for (int i = 1; i < 5; i++) {
            if(agents[i].getScore() < agents[idx].getScore()){
                idx = i;
            }
        }
        System.out.println(agents[idx]);
    }

    // 폭탄 해제
    // 97ms 8MB
    public static void defuseBomb() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");

        Bomb bomb = new Bomb(split[0], split[1], Integer.parseInt(split[2]));
        System.out.println(bomb);

    }

    // 상품 코드
    // 107ms 8MB
    public static void productCode() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] split = str.split(" ");

        Product product = new Product();
        System.out.println(product);

        Product product1 = new Product(split[0], Integer.parseInt(split[1]));
        System.out.println(product1);
    }

    // 사는 지역
    // 87ms 8MB
    public static void livingLocation() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Location[] locations = new Location[cnt];
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            locations[i] = new Location(split[0], split[1], split[2]);
        }

        if(cnt == 0){
            System.out.println(locations[0]);
            return;
        }
        int idx = 0;
        // == 0
        // >  양수 객체가 매개변수보다 앞설 때
        // <  음수 객체가 매개변수보다 늦을 때
        for(int i = 1; i<cnt; i++){
            if(locations[i].getName().compareTo(locations[idx].getName()) > 0){
                idx = i;
            }
        }
        System.out.println(locations[idx]);
    }

    // 비 오는 날
    // 91ms 8MB
    public static void rainyDay() throws IOException {
        // 근 시일내에 비가 오는 날의 정보를 출력하라
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        WeatherInformation weatherInformation = new WeatherInformation();
        int cnt = Integer.parseInt(br.readLine());
        int idx = 0;
        for (int i = 0; i < cnt; i++) {
            String str = br.readLine();
            String[] split = str.split(" ");
            WeatherInformation compareInformation = new WeatherInformation(split[0], split[1], split[2]);
            if(compareInformation.getWeather().equals("Rain")){
                if(weatherInformation.getDate().compareTo(compareInformation.getDate()) > 0){
                    weatherInformation = compareInformation;
                }
            }
        }
        System.out.println(weatherInformation);
    }
}

class WeatherInformation {
    private String date;
    private String day;
    private String weather;

    public WeatherInformation() {
        date = "9999-99-99";
        day = "NON";
        weather = "Norm";
    }

    public WeatherInformation(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }

    public String getDate() {
        return date;
    }

    public String getWeather() {
        return weather;
    }

    @Override
    public String toString() {
        return date + " " + day + " " +  weather;
    }
}

class Location {
    private String name;
    private String zipCode;
    private String city;

    public Location(String name, String zipCode, String city) {
        this.name = name;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name " + name + "\n" +
                "addr " + zipCode + "\n" +
                "city " + city;
    }
}

class Product {
    private String productName;
    private int productCode;

    public Product() {
        productName = "codetree";
        productCode = 50;
    }

    public Product(String productName, int productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "product " + productCode + " is " + productName;
    }
}

class Bomb {
    private String code;
    private String color;
    private int second;

    public Bomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }

    @Override
    public String toString() {
        return "code : " + code + "\n" +
                "color : " + color + "\n" +
                "second : " + second
                ;
    }
}

class Agent {
    private String codeName;
    private int score;

    public Agent(String codeName, int score) {
        this.codeName = codeName;
        this.score = score;
    }

    public String getCodeName() {
        return codeName;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return codeName + " " + score;
    }
}

class User {
    private String userId;
    private int level;

    public User() {
        userId = "codetree";
        level = 10;
    }

    public User(String userId, int level) {
        this.userId = userId;
        this.level = level;
    }

    @Override
    public String toString() {
        return "user " + userId + " lv " + level;
    }
}
