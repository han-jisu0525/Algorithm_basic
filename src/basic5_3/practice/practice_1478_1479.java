package basic5_3.practice;

import java.util.Scanner;

public class practice_1478_1479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int num = 1;
        int sum = n + m;

//        // 1478
//        for (int k = sum; k >= -(n*m); k--) {
//            for (int i = 0; i < n; i++) {
//                for (int j = 0; j < m; j++) {
//                    if (j-i==k) a[i][j] = num++;
//                }
//            }
//        }

        // 1479
        for (int k = sum; k >= -(n*m); k--) {
            for (int i = m-1; i >= 0; i--) {
                for (int j = 0; j < n; j++) {
                    if (i-j==k) a[j][i] = num++;
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
