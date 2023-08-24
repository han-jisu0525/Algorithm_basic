package codeup.basic2.basic_total;

import java.util.Scanner;

public class total_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double c = sc.nextDouble();
        double s = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.printf("%.1f MB", (h*b*c*s)/1024/1024/8);
    }
}
