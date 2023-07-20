package basic5_1;

import java.util.Arrays;
import java.util.Scanner;

public class total_1425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) x[i] = sc.nextInt();

        Arrays.sort(x);

        for (int i = 1; i <= N; i++) {
            System.out.printf("%d ", x[i-1]);

            if (i % C == 0) System.out.println();
        }
    }

}
