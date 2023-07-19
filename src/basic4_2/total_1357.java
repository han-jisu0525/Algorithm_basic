package basic4_2;

import java.util.Scanner;

public class total_1357 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n*2-1; i++) {
            if (i <= n) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = i; k <= n*2-1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
