package codeup.basic2.basic_bitShiftCalc;

import java.util.Scanner;

public class bitShiftCalc_1048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x<<y);  // x와 2의 y제곱을 곱한 값.
    }
}
