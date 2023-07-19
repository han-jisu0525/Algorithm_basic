package ch4;

import java.util.Scanner;

public class total_1283 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double[] x = new double[(int) b];
        for (int i = 0; i < b; i++) x[i] = sc.nextInt();

        double sum = a;
        for (int i = 0; i < b; i++) {
            sum = sum + (sum * x[i] / 100);
        }
        System.out.printf("%.0f\n", sum - a);
        if (sum - a > 0) System.out.println("good");
        else if (sum == a) System.out.println("same");
        else System.out.println("bad");
    }
}
