package codeup.basic5_3.practice;

import java.util.Scanner;

public class practice_1466 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= 1; j--) {
                System.out.printf("%d ", n*j - i);
            }
            System.out.println();
        }
    }
}
