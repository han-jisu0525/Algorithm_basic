package basic2.basic_total;

import java.util.Scanner;

public class total_1143_1144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // 1143
        System.out.println(x & y);

        // 1144
        System.out.println(x | y);
    }
}
