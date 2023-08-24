package codeup.basic5_1;

import java.util.Scanner;

public class total_1440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n];
        for (int i = 0; i < n; i++) k[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("%d: ", i+1);
            for (int j = 0; j < n; j++) {
                if (k[i] == k[j] && i == j) continue;
                else if (k[i] > k[j]) System.out.print("> ");
                else if (k[i] < k[j]) System.out.print("< ");
                else if (k[i] == k[j]) System.out.print("= ");
            }
            System.out.println();
        }
    }
}
