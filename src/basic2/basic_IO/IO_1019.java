package basic2.basic_IO;

import java.util.Scanner;

public class IO_1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String[] a = x.split("\\.");

        int year = Integer.parseInt(a[0]);
        int month = Integer.parseInt(a[1]);
        int day = Integer.parseInt(a[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
