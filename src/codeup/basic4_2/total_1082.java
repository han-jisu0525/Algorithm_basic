package codeup.basic4_2;

import java.util.Scanner;

public class total_1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(16);

        for (int j = 1; j < 16; j++) {
            System.out.printf("%H * %H = %H\n", x, j, x * j);
        }

    }
}
