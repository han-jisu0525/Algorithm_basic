package baekjoon.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ch8_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        List<Character> list = new ArrayList<>();
        while (B > 0) {
            if (B % N < 10) {
                list.add((char) (B % N + '0'));
            }
            else{
                list.add((char) (B % N - 10 + 'A'));
            }

            B /= N;
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }    }
}
