package baekjoon.ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch9_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println();
        }

        for (int i = 2; i <= N;) {
            if (N % i == 0) {
                System.out.println(i);
                N /= i;
                continue;
            } else {
                i++;
            }
        }
    }
}
