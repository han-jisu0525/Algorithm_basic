package basic5_1;

import java.util.Arrays;
import java.util.Scanner;

public class total_1420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String[] n = new String[x];
        int[] score = new int[x];
        String[] name = new String[x];

        for (int i = 0; i < x; i++) {
            name[i] = sc.next();
            score[i] = sc.nextInt();
            n[i] = name[i] + " " + score[i];
        }
        Arrays.sort(score);

        for (int i = 0; i < x; i++) {
            if(n[i].contains(String.valueOf(score[(x-1)-2]))) {
                System.out.println(name[i]);
            }
        }

    }
}
