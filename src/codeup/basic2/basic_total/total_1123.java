package codeup.basic2.basic_total;

import java.util.Scanner;

public class total_1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        double ans = (double) 9 / 5 * x + 32;

        System.out.printf("%.3f", ans);
    }
}
