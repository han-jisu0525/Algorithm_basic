package baekjoon.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ch13_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 5;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int avg = 0;

        for (int i = 0; i < N; i++) {
            avg += arr[i];
        }

        avg /= N;
        Arrays.sort(arr);

        System.out.println(avg);
        System.out.println(arr[N/2]);
    }
}
