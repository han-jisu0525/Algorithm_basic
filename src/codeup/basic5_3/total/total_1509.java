package codeup.basic5_3.total;

import java.util.Scanner;

public class total_1509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[10][10];
        int[] b = new int[10]; // 말
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) b[i] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            if (b[i] != 0) {
                for (int j = 9; j >= 0; j--) {
                    cnt++;
                    if (a[j][i] > 0) {
                        System.out.println(i+1 + "crash");
                        break;
                    } else if (a[j][i] < 0) {
                        System.out.println(i+1 + "fall");
                        break;
                    } else if (j == 0 && cnt == 10) System.out.println(i+1 + "safe");
                }
            }
        }
    }
}
