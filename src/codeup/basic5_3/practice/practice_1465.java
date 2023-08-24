package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1465 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.printf("%d ", m*(n-i) + j);
            }
            System.out.println();
        }
    }
}
