package codeup.basic5_1;

import java.util.Scanner;

public class array_1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] x = new int[23];

        for (int i = 0; i < n; i++) {
            x[a[i]-1]++;
        }

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%d ", x[i]);
        }
    }
}
