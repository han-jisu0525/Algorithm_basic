package codeup.basic5_3.total;

import java.util.Scanner;

public class total_4085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0, plus = 0;

        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n-y+1; i++) {
            for (int j = 0; j < m-x+1; j++) {
                for (int k = 0; k < y; k++) {
                    for (int l = 0; l < x; l++) {
                        plus += a[i+k][j+l];
                    }
                }
                if (sum < plus) sum = plus;
                plus = 0;
            }
        }
        System.out.println(sum);

    }

}
