package codeup.basic5_3.total;

import java.util.Scanner;

public class total_1510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int row = 0, col = 1;

        for (int num = 1; num <= n*n; num++) {
            a[row][col] = num;
            if (num % n == 0) {
                row++;
            } else {
                row--; col++;
                if (row == -1) {row = n-1;}
                if (col == n) {col = 0;}
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
