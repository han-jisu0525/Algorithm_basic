package baekjoon.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch6_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int NN = Integer.parseInt(N);

        for (int i = 1; i <= NN; i++) {
            for (int j = 1; j <= NN-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < NN; i++) {
            for (int j = i-1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (NN-i)*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
