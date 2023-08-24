package codeup.basic4_2;

import java.util.Scanner;

public class total_1380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        for (int i = 1; i < k; i++) {
            System.out.printf("%d %d\n", i, k-i);
        }
    }
}
