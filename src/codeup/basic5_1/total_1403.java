package codeup.basic5_1;

import java.util.Scanner;

public class total_1403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] x = new int[k];

        for (int i = 0; i < k; i++) x[i] = sc.nextInt();

        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j < k; j++) {
                System.out.println(x[j]);
            }
        }
    }
}
