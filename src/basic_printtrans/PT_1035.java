package basic_printtrans;

import java.util.Scanner;

public class PT_1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.next(), 16);

        System.out.printf("%o", x);
    }
}
