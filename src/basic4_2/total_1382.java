package basic4_2;

import java.util.Scanner;

public class total_1382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d x %d = %d\t", j, i, i*j);
            }
            System.out.println();
        }
    }
}
