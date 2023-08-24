package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1472_1473 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

//        // 1472
//        for (int i = n; i >= 1; i--) {
//            if (i % 2 == 1) {
//                for (int j = 0; j < m; j++) {
//                    System.out.printf("%d ", m*i - j);
//                }
//            } else {
//                for (int j = 0; j < m; j++) {
//                    System.out.printf("%d ", m*(i-1)+1+j);
//                }
//            }
//            System.out.println();
//        }

        // 1473
        for (int i = n; i >= 1; i--) {
            if (i % 2 == 1) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%d ", m*(i-1)+1+j);
                }
            } else {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%d ", m*i - j);
                }
            }
            System.out.println();
        }

    }
}
