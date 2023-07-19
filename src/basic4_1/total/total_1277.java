package basic4_1.total;

import java.util.Scanner;

public class total_1277 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] N1 = new int[N];
        for (int i = 0; i < N; i++) N1[i] = sc.nextInt();
        System.out.printf("%d %d %d", N1[0], N1[N/2], N1[N-1]);
    }
}
