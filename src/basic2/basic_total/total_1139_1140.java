package basic2.basic_total;

import java.util.Scanner;

public class total_1139_1140 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 1139
//        if (x==1 && y==1) System.out.println("1");

        // 1140
        if(x==1 || y==1) System.out.println("1");
        else System.out.println("0");
    }
}
