package basic2.basic_ternaryOperator;

import java.util.Scanner;

public class TO_1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(String.valueOf(x > y ? x : y));
    }
}
