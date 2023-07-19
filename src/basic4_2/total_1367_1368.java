package basic4_2;

import java.util.Scanner;

public class total_1367_1368 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int k = sc.nextInt();
        String d = sc.next();

        if (d.equals("R")) {
            for (int i = 1; i <= h; i++) {
                for (int j = h; j > i; j--) {
                    System.out.print(" ");
                }
                for (int l = 1; l <= k; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        if (d.equals("L")) {
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int l = 1; l <= k; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
