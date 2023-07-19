package basic4_2;

import java.util.Scanner;

public class total_3122_미완성 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < i*2; j++) {
                System.out.print("*");
            }
//            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < (n-1)*2 - 2*i; j++) {
                System.out.print("*");
            }
//            System.out.print("*");
            System.out.println();
        }
    }
}
