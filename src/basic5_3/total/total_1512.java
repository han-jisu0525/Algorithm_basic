package basic5_3.total;

import java.util.Scanner;

public class total_1512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[][] a =  new int[N+1][N+1];
        a[X][Y] = 1;
        int num = a[X][Y];

        // 세로줄 (윗부분)
        for (int i = X-1; i >= 1; i--) {
            a[i][Y] = ++num;
        }
        // 세로줄 (아랫부분)
        num = a[X][Y];
        for (int i = X+1; i <= N; i++) {
            a[i][Y] = ++num;
        }
        for (int i = 1; i <= N; i++) {
            num = a[i][Y];
            // 나머지 (왼쪽)
            for (int j = Y-1; j >= 1; j--) {
                a[i][j] = ++num;
            }
            num = a[i][Y];
            for (int j = Y+1; j <= N; j++) {
                a[i][j] = ++num;
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }

    }
}
