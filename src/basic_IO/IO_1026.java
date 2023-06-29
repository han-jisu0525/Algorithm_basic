package basic_IO;

import java.util.Scanner;

public class IO_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] data = x.split(":");
        System.out.println(data[1]);

    }
}
