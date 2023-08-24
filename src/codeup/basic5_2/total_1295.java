package codeup.basic5_2;

import java.util.Scanner;

public class total_1295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char[] a = x.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (65 <= a[i] && a[i] <= 90) {
                a[i] += 32;
            } else if (97<=a[i] && a[i]<= 122) {
                a[i] -= 32;
            }
        }
        System.out.println(a);


    }
}
