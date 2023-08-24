package codeup.basic5_3.practice;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class practice_1496_1497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n/2];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
//            // 1496
//            if (i % 2 == 1) b[i/2] = min(a[i-1], a[i]);

            // 1497
            if (i % 2 == 1) b[i/2] = max(a[i-1], a[i]);
        }
        for (int i = 0; i < n/2; i++) System.out.printf("%d ", b[i]);
    }
}
