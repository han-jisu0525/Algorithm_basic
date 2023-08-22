package basic5_4;

import java.util.Arrays;
import java.util.Scanner;

public class total_1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n];
        String[] name = new String[n];
        int[] score = new int[n];

        for (int i = 0; i < n; i++) {
            name[i] = sc.next();
            score[i] = sc.nextInt();
            a[i] = name[i] + " " + score[i];
        }
        Arrays.sort(score);

        for (int i = 0; i < n; i++) {
            if (a[i].contains(String.valueOf(score[2]))) {
                System.out.println(name[i]);
            }
        }
    }
}
