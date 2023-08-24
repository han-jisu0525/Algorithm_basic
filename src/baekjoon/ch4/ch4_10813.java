package baekjoon.ch4;

import java.util.Scanner;

public class ch4_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        for (int x = 1; x <= N; x++) a[x] = x;
        int M = sc.nextInt();
        int i, j, temp;

        for (int x = 0; x < M; x++) {
            i = sc.nextInt();
            j = sc.nextInt();

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for (int x = 1; x <= N; x++) {
            System.out.printf("%d ", a[x]);
        }

    }
}
