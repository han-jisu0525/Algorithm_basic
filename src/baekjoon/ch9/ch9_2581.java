package baekjoon.ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch9_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int minPrime = 0;
        int sum = 0;

        if (min == 1) { min = 2; }
        for (int i = min; i <= max; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { sum += i; }
            if (minPrime == 0 && isPrime) { minPrime = i; }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }
    }
}
