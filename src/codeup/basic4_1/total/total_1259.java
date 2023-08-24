package codeup.basic4_1.total;

import java.util.Scanner;

public class total_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
