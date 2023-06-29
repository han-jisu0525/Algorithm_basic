package basic_IO;

import java.util.Scanner;

public class IO_1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] a = x.split("\\.");

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
