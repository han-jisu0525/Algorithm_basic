package basic4.total;

import java.util.Scanner;

public class total_1276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int ans = 1;

        for (int i = N; i >= 1; i--) {
            ans *= i;
        }

        System.out.println(ans);
    }
}
