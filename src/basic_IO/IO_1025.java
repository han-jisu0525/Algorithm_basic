package basic_IO;

import java.util.Scanner;

public class IO_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        int[] data = new int[x.length()];

        for(int i = 0; i < x.length(); i++) {
            // charAt(i) - '0': String/Char --> Int로 변경
            data[i] = x.charAt(i) - '0';
        }
        System.out.println("[" + data[0]*10000 + "]");
        System.out.println("[" + data[1]*1000 + "]");
        System.out.println("[" + data[2]*100 + "]");
        System.out.println("[" + data[3]*10 + "]");
        System.out.println("[" + data[4] + "]");


    }
}
