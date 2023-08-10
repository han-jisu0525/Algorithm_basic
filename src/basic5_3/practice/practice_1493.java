package basic5_3.practice;

import java.util.Scanner;

public class practice_1493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int num = 0;

        // 배열 채우기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                for (int k = 0; k <= i; k++) {
                    for (int l = 0; l <= j; l++) {
                        num += a[k][l];
                    }
                }
                b[i][j] = num;
                num = 0;
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }

    }
}
