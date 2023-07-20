package basic5_1;

import java.util.Scanner;

public class total_1405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];

        for (int i = 0; i < n; i++) k[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < k.length; j++) {
                System.out.printf("%d ", k[j]);
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("%d ", k[j]);
            }
            System.out.println();
        }
    }
}
