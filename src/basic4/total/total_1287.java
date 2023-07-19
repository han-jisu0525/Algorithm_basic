package ch4;

import java.util.Scanner;

public class total_1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String x = "*";
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < i * n; j++) {
                System.out.print(x);
            }
            System.out.println("");
        }
    }
}
