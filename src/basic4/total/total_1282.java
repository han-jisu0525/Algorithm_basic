package ch4;

import java.util.Scanner;

public class total_1282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = 1;

        for (long t = n; t > 0; t--) {
            if (t * t < n) {
                k = n - (t * t);
                System.out.printf("%d %d", k, t);
                break;
            }
        }
    }
}
