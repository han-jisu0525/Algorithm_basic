package basic4_1.total;

import java.util.Scanner;

public class total_1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] n1 = new int[n];

        int cnt = 0;

        for (int i = 0; i < n; i++) {
            n1[i] = sc.nextInt();
            if (n1[i] % 2 != 0) cnt++;
        }
        System.out.println(cnt);

    }
}
