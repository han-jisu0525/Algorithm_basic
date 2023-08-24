package codeup.basic5_1;

import java.util.Scanner;

public class total_1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        for (int i = 0; i < x.length; i++) x[i] = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(x[k-1]);
    }
}
