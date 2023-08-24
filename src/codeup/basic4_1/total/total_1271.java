package codeup.basic4_1.total;

import java.util.Arrays;
import java.util.Scanner;

public class total_1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] x1 = new int[x];

        for (int i = 0; i < x; i++) x1[i] = sc.nextInt();

        Arrays.sort(x1);
        System.out.println(x1[x1.length-1]);
    }
}
