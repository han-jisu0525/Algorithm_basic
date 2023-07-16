package basic4.total;

import java.util.Scanner;

public class total_1266_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] a = new int[x];

        int sum = 0;

        // 1266
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();

            // 1267
            if (a[i] % 5 == 0) sum += a[i];

        }
        System.out.println(sum);
    }
}
