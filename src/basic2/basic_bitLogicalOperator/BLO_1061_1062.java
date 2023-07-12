package basic2.basic_bitLogicalOperator;

import java.util.Scanner;

public class BLO_1061_1062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // 1061
        System.out.println(x|y);

        // 1062
        System.out.println(x ^ y);
    }
}
