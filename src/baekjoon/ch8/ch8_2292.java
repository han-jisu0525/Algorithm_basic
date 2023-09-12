package baekjoon.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch8_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1; // 겹 수 (최소 루트)
        int range = 2; // 범위 (최솟값 기준)

        if (N == 1) {
            System.out.println(1);
        } else {
            while (range <= N) {
                range += (count * 6);
                count++;
            }
            System.out.println(count);
        }
    }
}
