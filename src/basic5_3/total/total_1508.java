package basic5_3.total;

import java.util.Scanner;

public class total_1508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] a = new int[N][N];

        for (int i = 0; i < N; i++) {
            a[i][0] = sc.nextInt();
            for (int j = 1; j <= i; j++) {
                a[i][j] = a[i][j-1] - a[i-1][j-1];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (a[i][j] != 0) {
                    System.out.printf("%d ", a[i][j]);
                }
            }
            System.out.println();
        }

    }
}
