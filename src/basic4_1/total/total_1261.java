package basic4_1.total;

import java.util.Scanner;

public class total_1261 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) a[i] = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (a[i] % 5 == 0) {
                System.out.println(a[i]);
                break;
            }
            if (i == 9) System.out.println("0");
        }
    }
}
