package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1486_1487 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int row = -1, col = m-1;
        int reverse = 1, limit = 0;

        // 1486
//      for (int num = 1; num < n*m;) {

        // 1487
        for (int num = n*m; num >= 1;) {
            for (int i = 0; i < n-limit; i++) {
                row += reverse;
                a[row][col] = num--;
            }
            for (int i = 0; i < m-limit-1; i++) {
                col -= reverse;
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
