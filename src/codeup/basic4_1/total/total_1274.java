package codeup.basic4_1.total;

import java.util.Scanner;

public class total_1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) cnt++;
        }

        if (cnt == 2) System.out.println("prime");
        else System.out.println("not prime");
    }
}
