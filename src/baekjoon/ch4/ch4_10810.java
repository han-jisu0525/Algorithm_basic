package baekjoon.ch4;

import java.util.Scanner;

public class ch4_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        int M = sc.nextInt();
        int i, j, k = 0;

        for (int x = 0; x < M; x++) {
            i = sc.nextInt();
            j = sc.nextInt();
            k = sc.nextInt();
            while (i <= j) {
                a[i] = k;
                i++;
            }
        }

        for (int x = 1; x <= N; x++) {
            System.out.printf("%d ", a[x]);
        }
    }
}
