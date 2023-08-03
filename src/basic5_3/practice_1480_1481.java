package basic5_3;

import java.util.Scanner;

public class practice_1480_1481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int num = n*m;

//        // 1480
//        for (int k = 0; k < n*m; k++) {
//            for (int i = 0; i < m; i++) {
//                for (int j = 0; j < n; j++) {
//                    if (i+j == k) a[j][i] = num--;
//                }
//            }
//        }

        // 1481
        for (int k = 0; k < n*m; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (i+j == k) a[i][j] = num--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
