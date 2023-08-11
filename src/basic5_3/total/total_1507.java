package basic5_3.total;

import java.util.Scanner;

public class total_1507 {
    public static void main(String[] args) {
        int[][] a = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2 = 0;

        for (int i = 0; i < 4; i++) {
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    a[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (a[i][j] == 1) sum++;
            }
        }
        System.out.println(sum);
    }
}
