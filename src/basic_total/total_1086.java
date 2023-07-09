package basic_total;

import java.util.Scanner;

public class total_1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.printf("%.2f", w*h*b/1024/1024/8);
    }
}
