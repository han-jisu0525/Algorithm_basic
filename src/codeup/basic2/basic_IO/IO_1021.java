package codeup.basic2.basic_IO;

import java.util.Scanner;

public class IO_1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String[] data = x.split("");

        for(int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }
}
