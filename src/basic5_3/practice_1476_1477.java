package basic5_3;

import java.util.Scanner;

public class practice_1476_1477 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int num = 1;
        int sum = n+m;

//        // 1476
//        for (int k = 0; k < sum; k++) {
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (i+j == k) a[j][i] = num++;
//                }
//            }
//        }
//
        // 1477
        for (int k = 0; k < sum; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i+j == k) a[i][j] = num++;
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                System.out.printf("%d ", a[x][y]);
            }
            System.out.println();
        }
    }
}
