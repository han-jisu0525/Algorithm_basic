package basic4_2;

import java.util.Scanner;

public class total_1356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i == 1 || i == x) {
                for (int j = 1; j <= x; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= x; k++) {
                    if (k==1 || k==x) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
