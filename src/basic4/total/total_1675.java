package ch4;

import java.util.Scanner;

public class total_1675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char[] a = x.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') System.out.print(" ");
            else System.out.print(a[i] -= 3);
        }

    }
}
