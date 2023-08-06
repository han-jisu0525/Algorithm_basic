package basic5_3.practice;

import java.util.Scanner;

public class practice_1460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d ", n*i + j);
            }
            System.out.println();
        }
    }
}
