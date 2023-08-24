package codeup.basic4_1.total;

import java.util.Scanner;

public class total_1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;

        for (int i = 1; ;i++) {
            if (n >= 10) {
                cnt++;
                n /= 10;
            } else break;
        }
        System.out.println(cnt+1);
    }
}
