package codeup.basic3.total;

import java.util.Scanner;

public class total_1173 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min < 30) {
            if (hour == 0) System.out.println("23 " + min + 30);
            else System.out.printf("%d %d", hour-1, min+30);
        } else {
            if (hour == 0) System.out.println("00 " + (min - 30));
            else System.out.printf("%d %d", hour, min-30);
        }
    }
}
