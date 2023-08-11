package basic5_3.total;

import java.util.Scanner;

public class total_1505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int row = 0, col = -1, reverse = 1, limit = 0;

        for (int num = 1; num <= n*n;) {
            for (int i = 0; i < n-limit; i++) {
                col += reverse;
                a[row][col] = num++;
            }
            for (int i = 0; i < n-limit-1; i++) {
                row += reverse;
                a[row][col] = num++;
            }
            limit++;
            reverse = -reverse;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
