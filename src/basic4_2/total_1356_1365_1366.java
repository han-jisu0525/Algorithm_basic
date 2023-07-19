package basic4_2;

import java.util.Scanner;

public class total_1356_1365_1366 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            // 1366
            if (i == 1 || i == x || i == x/2 + 1) {
                for (int j = 1; j <= x; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= x; k++) {
                    // 1365, 1366
                    if (k==1 || k==x || k==i || k==x-i+1 || k == x/2+1) {
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
