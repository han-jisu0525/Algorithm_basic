package codeup.basic4_2;

import java.util.Scanner;

public class total_1370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= h*2-1; j++) {
                if (j <= h) {
                    for (int k = 1; k < j; k++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                } else {
                    for (int k = j; k < h*2-1; k++) {
                        System.out.print(" ");
                    }
                    System.out.println("*");
                }
            }
        }
    }
}
