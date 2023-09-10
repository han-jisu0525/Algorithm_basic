package baekjoon.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch8_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int Q = 25;
        int D = 10;
        int N = 5;
        int P = 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C / Q + " ");
            C %= Q;

            sb.append(C / D + " ");
            C %= D;

            sb.append(C / N + " ");
            C %= N;

            sb.append(C / P + "\n");
        }
        System.out.print(sb);
    }
}
