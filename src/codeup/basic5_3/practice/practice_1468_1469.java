package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1468_1469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        // 1468
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.printf("%d ", j + n*i);
//                }
//            } else {
//                for (int j = 0; j < n; j++) {
//                    System.out.printf("%d ", (n*i)+n-j);
//                }
//            }
//            System.out.println();
//        }

        // 1469
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%d ", (n*i)+n-j);
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%d ", j + n*i);
                }
            }
            System.out.println();
        }

    }
}
