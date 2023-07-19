package basic4_1.total;

import java.util.Scanner;

public class total_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int a = 0;

        while (a <= x) {
            if (a % 2 == 0) sum += a;
            a++;
        }
        System.out.println(sum);
    }
}
