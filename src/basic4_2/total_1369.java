package basic4_2;

import java.util.Scanner;

public class total_1369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j==1 || j==n) {
                    System.out.print("*");
                }  else if ((i+j)%k == 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            } 
            System.out.println();
        }
    }
}
