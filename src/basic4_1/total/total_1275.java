package basic4_1.total;

import java.util.Scanner;

public class total_1275 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = (int) Math.pow(n, k);

        System.out.println(ans);
    }
}
