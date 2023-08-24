package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1490_1491 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int row = n, col = 0;
        int limit = 0, reserve = 1;

        // 1490
//      for (int num = 1; num < n*m;) {

        for (int num = n*m; num >= 1;) {
            for (int i = 0; i < n-limit; i++) {
                row -= reserve;
                a[row][col] = num--;
            }
            for (int i = 0; i < m-limit-1; i++) {
                col += reserve;
                a[row][col] = num--;
            }

            limit++;
            reserve = -reserve;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

    }
}
