package codeup.basic5_2;

import java.util.Scanner;

public class total_6130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split("x");
        float a = Float.parseFloat(x[0]);
        float b = Float.parseFloat(x[1]);

        if (b > 0) System.out.printf("%.2f", -(b/a));
        else System.out.printf("%.2f", b/a);
    }
}
