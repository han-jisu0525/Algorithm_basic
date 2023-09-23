package baekjoon.ch13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch13_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] count = new int[10];  // 자릿수. 1,000,000,000보다 작은 수
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            // 해당 숫자 배열 부분을 +1
            // ex) 999면 count[8]이 3
            count[s.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            while (count[i]-- > 0) {
                System.out.println(i);
            }
        }
    }
}
