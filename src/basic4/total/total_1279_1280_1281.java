package ch4;

import java.util.Scanner;

public class total_1279_1280_1281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int i = a;
        while (i <= b) {
            // 1281
            if ((i == a) && (i % 2 == 1)) {
                    sum += i;
                    System.out.print(a);
            }
            else if (i % 2 == 1) {
                sum += i;
                // 1280
                System.out.print("+" + i);
            }
            else {
                sum -= i;
                // 1280
                System.out.print("-" + i);
            }
            i++;
        }
        System.out.println("=" + sum);
    }
}
