package basic5_3.practice;

import java.util.Scanner;

public class practice_1492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int k = 1;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = num++;

        for (int i = 1; i < n; i++) {
            k = k + i + 1;
            a[i] = k;
        }

        for (int i = 0; i < n; i++) System.out.printf("%d ", a[i]);

    }
}
