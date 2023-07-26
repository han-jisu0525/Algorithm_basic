package basic5_3;

import java.util.Scanner;

public class practice_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", i + n*j);
            }
            System.out.println();
        }
    }
}
