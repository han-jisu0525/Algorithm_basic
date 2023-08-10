package basic5_3.practice;

import java.util.Scanner;

// 주석처리 1498
public class practice_1498_1499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int g = sc.nextInt();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        for (int i = 0; i < n; i+=g) {
//            int min = a[i];
            int max = a[i];

            for (int j = i; j < i+g; j++) {
                if (j < n) {
//                    if (min > a[j]) min = a[j];
                    if (max < a[j]) max = a[j];
                }
            }
//            System.out.printf("%d ", min);
            System.out.printf("%d ", max);
        }
    }
}
