package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1470_1471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        // 1470
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (j % 2 == 1) {
//                    System.out.printf("%d ", i + (j-1)*n);
//                } else {
//                    System.out.printf("%d ", j*n - i + 1);
//                }
//            }
//            System.out.println();
//        }

        // 1471
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) {
                    System.out.printf("%d ", j*n - i + 1);
                } else {
                    System.out.printf("%d ", i + (j-1)*n);
                }
            }
            System.out.println();
        }

    }
}
