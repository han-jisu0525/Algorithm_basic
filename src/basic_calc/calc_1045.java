package basic_calc;

import java.io.PrintStream;
import java.util.Scanner;

public class calc_1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.printf("%.2f", (double) x / y);
    }
}
