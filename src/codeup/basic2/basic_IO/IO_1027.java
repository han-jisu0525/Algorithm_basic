package codeup.basic2.basic_IO;

import java.util.Scanner;

public class IO_1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.next();
        String[] a = x.split("\\.");

        System.out.println(a[2]+"-"+a[1]+"-"+a[0]);
    }
}
