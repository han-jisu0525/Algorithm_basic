package baekjoon.ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch9_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { count++; }
        }
        int[] a = new int[count];
        int j = 0;
        if (K > count) {
            System.out.println(0);
        } else {
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) {
                    a[j] = i;
                    j++;
                }
            }
            System.out.println(a[K-1]);
        }
    }
}
