package codeup.basic4_2;

import java.util.Scanner;

public class total_1351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = x; i <= y; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%d\n", i, j, i * j);
            }
        }
    }
}
