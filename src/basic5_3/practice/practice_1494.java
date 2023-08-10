package basic5_3.practice;

import java.util.Scanner;

public class practice_1494 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] d = new int[n+1];
        int s = 0, e = 0, u = 0, sum = 0;
        for (int i = 0; i < k; i++) {
            s = sc.nextInt();
            e = sc.nextInt();
            u = sc.nextInt();
            d[s] += u;
            d[e+1] -= u;
        }
        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", d[i]);
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            sum += d[i];
            System.out.printf("%d ", sum);
        }
    }
}
