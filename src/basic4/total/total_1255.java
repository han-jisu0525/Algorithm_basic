package basic4.total;

import java.util.Scanner;

public class total_1255 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        while (a < b) {
            System.out.printf("%.2f ", a);
            a += 0.01;
        }
    }
}
