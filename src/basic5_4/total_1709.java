package basic5_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class total_1709 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] a = new Integer[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());

//        System.out.println(Arrays.toString(a));
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
