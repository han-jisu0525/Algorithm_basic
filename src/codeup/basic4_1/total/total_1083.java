package codeup.basic4_1.total;

import java.util.Scanner;

public class total_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i%10==3 || i%10==6 || i%10==9) System.out.print("X ");
            else System.out.print(i + " ");
        }
    }
}
