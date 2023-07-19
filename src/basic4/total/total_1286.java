package ch4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class total_1286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        for (int i = 0; i < x.length; i++) x[i] = sc.nextInt();

        Arrays.sort(x);
        System.out.println(x[x.length-1]);
        System.out.println(x[0]);
    }
}
