package codeup.basic4_1.total;

import java.util.Scanner;

public class total_1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            a = a * m + d;
        }
        System.out.println(a);

    }
}
