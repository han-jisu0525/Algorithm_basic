package codeup.basic5_1;

import java.util.Scanner;

public class total_1430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        int M = sc.nextInt();
        int[] b = new int[M];
        for (int i = 0; i < M; i++) b[i] = sc.nextInt();

        int[] ans = new int[M];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (b[i] == a[j]) {
                    ans[i] = 1;
                    break;
                }
            }
            System.out.printf("%d ", ans[i]);
        }

    }
}
