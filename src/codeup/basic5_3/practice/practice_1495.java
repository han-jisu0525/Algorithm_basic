package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1495 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] d = new int[n+1][m+1];
        int k = sc.nextInt();
        int x1, x2, y1, y2 = 0, u = 0, sum = 0;

        for (int i = 0; i < k; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            u = sc.nextInt();

            d[x1][y1] = d[x1][y1]+u;
            d[x2+1][y2+1] = d[x2+1][y2+1]+u;

            d[x1][y2+1] = d[x1][y2+1]-u;
            d[x2+1][y1] = d[x2+1][y1]-u;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", d[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += d[i][j];
                System.out.printf("%d ", sum);
            }
            sum = 0;
            System.out.println();
        }

    }
}
