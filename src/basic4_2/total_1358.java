package basic4_2;

import java.util.Scanner;

public class total_1358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n/2+1; i++) {
            for (int j = 0; j < n/2+1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
