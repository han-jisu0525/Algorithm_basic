package basic2.basic_total;

import java.util.Scanner;

public class total_1135_1136_1137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // 1135
        if (x >= y) System.out.println("1");
        else System.out.println("0");

        // 1136
        if (x == y) System.out.println("1");
        else System.out.println("0");

        // 1137
        if (x != y) System.out.println("1");
        else System.out.println("0");

    }
}
