package codeup.basic3.total;

import java.util.Scanner;

public class total_1206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a <= b) {
            if (b % a != 0) System.out.println("none");
            else System.out.printf("%d * %d = %d", a, b/a, b);
        } else {
            if (a % b != 0) System.out.println("none");
            else System.out.printf("%d * %d = %d", b, a/b, a);
        }
    }
}
