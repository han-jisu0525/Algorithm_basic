package basic2.basic_IO;

import java.util.Scanner;

public class IO_1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] a = x.split("-");

        System.out.println(a[0]+a[1]);
    }
}
