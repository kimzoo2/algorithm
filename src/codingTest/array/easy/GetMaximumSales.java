package src.codingTest.array.easy;

import java.util.Scanner;

public class GetMaximumSales {

    // input 100000 12000 34MB 768ms
    static void getMaximumSalesLeture(int day, int period, int[] sales){
        int answer= 0, sum = 0;
        for(int i = 0; i<period; i++) sum += sales[i];
        answer = sum;

        for(int i=period; i<day; i++){
            sum += (sales[i] - sales[i-period]);
            answer= Math.max(answer, sum);
        }

        System.out.println(answer);
    }

    // input 100000 12000 35MB 1473ms
    static void getMaximumSales(int day, int period, int[] sales){
        int maximumSales = 0; // 최고매출액
        int i = 0;
        int j = 0;

        while(i < day-period -1){
            int recentSales = 0;
            j = i;
            while(j < i + period){
                recentSales += sales[j++];
            }
            if(maximumSales <recentSales) maximumSales = recentSales;
            i++;
        }

        System.out.println(maximumSales);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int period = sc.nextInt();
        int[] arr1 = new int[day];

        for(int i = 0; i<day; i++){
            arr1[i] = sc.nextInt();
        }
        getMaximumSales(day, period, arr1);
        getMaximumSalesLeture(day, period, arr1);
    }
}