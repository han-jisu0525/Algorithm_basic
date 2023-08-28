package baekjoon.ch7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch7_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] a = new char[5][15];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            String str = br.readLine();

            if (max < str.length()) { max = str.length(); }

            for (int j = 0; j < str.length(); j++) {
                a[i][j] = str.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (a[j][i] == '\0') { continue; }
                sb.append(a[j][i]);
            }
        }
        System.out.println(sb);
    }
}
