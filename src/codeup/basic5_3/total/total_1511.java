package codeup.basic5_3.total;

import java.util.Scanner;

public class total_1511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] a = new int[N][N];

        for (int num = 1; num <= N*N;) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    a[i][j] = num++;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i==0 || i==N-1) {
                    sum += a[i][j];
                } else if (j==0 || j==N-1) {
                        sum += a[i][j];
                }
            }
        }
        System.out.println(sum);


    }
}
