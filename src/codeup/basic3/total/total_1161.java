package codeup.basic3.total;

import java.util.Scanner;

public class total_1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = x + y;

        if (x % 2 == 0) {
            System.out.print("짝수 + ");
            if (y % 2 == 0) {
                System.out.print("짝수 = ");
            } else System.out.print("홀수 = ");

            if (ans % 2 == 0) System.out.print("짝수");
            else System.out.print("홀수");
        } else {
            System.out.print("홀수 + ");
            if (y % 2 == 0) {
                System.out.print("짝수 = ");
            } else System.out.print("홀수 = ");

            if (ans % 2 == 0) System.out.print("짝수");
            else System.out.print("홀수");

        }

    }
}
