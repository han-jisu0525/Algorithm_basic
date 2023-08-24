package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = m-1; j >= 0; j--) {
                System.out.printf("%d ", n*j + i);
            }
            System.out.println();
        }

    }
}
