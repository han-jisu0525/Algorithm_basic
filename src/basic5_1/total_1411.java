package basic5_1;

import java.util.Arrays;
import java.util.Scanner;

public class total_1411 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N-1];
        for (int i = 0; i < N-1; i++) x[i] = sc.nextInt();
        Arrays.sort(x);

        for (int i = 0; i < N-1; i++) {
            if (x[i] != i+1) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
