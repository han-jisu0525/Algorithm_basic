package baekjoon.ch7;

import java.util.Scanner;

public class ch7_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[10][10];
        int max_i = 1, max_j = 1;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int z = 0; z < 81; z++) {
            for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    if (a[i][j] > a[max_i][max_j]) {
                        max_i = i;
                        max_j = j;
                    }
                }
            }
        }

        System.out.printf("%d\n%d %d", a[max_i][max_j], max_i, max_j);

    }
}
