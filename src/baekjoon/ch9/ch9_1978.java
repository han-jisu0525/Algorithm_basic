package baekjoon.ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch9_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (st.hasMoreTokens()) {

            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {isPrime = false;}

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) { count++; }
        }
        System.out.println(count);
    }
}
