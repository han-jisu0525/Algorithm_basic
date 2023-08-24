package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1488_1489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int reverse = 1, limit = 0;
        int row = n-1, col= m;

        // 1488
//      for (int num = 1; num < n*m;) {

        // 1489
        for (int num = n*m; num >= 1;) {
            for (int i = 0; i < m-limit; i++) {
                col -= reverse;
                a[row][col] = num--;
            }
            for (int i = 0; i < n-limit-1; i++) {
                row -= reverse;
                a[row][col] = num--;
            }
            limit++;
            reverse = -reverse;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

    }
}
