package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1482_1483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int num = 1;
        int sum = n+m;

//        // 1482
//        for (int k = sum; k >= -100; k--) {
//            for (int i = m-1; i >= 0; i--) {
//                for (int j = 0; j < n; j++) {
//                    if (j-i == k) a[j][i] = num++;
//                }
//            }
//        }

        // 1483
        for (int k = sum; k >= -100; k--) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j-i == k) {
                        a[j][i] = num++;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
