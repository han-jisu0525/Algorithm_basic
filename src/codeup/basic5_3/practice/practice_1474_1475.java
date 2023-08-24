package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1474_1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 1474
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 1; j--) {
                if (j % 2 == 0) {
                    System.out.printf("%d ", n * (j-1) +1+i);
                } else {
                    System.out.printf("%d ", n*j-i);
                }
            }
            System.out.println();
        }

        // 1475
        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 1; j--) {
                if (j % 2 == 0) {
                    System.out.printf("%d ", n*j-i);
                } else {
                    System.out.printf("%d ", n * (j-1) +1+i);
                }
            }
            System.out.println();
        }

    }
}
