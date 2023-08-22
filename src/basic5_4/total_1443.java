package basic5_4;

import java.util.Scanner;

public class total_1443 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int temp, key = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            key = a[i];
            int j = i-1;
            while (j >= 0 && key < a[j]) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
