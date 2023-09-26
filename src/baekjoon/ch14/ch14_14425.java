package baekjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ch14_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> S = new HashMap<>();
        for (int i = 0; i < N; i++) { // 집합 S에 포함되어있는 문자열
            S.put(br.readLine(), 0);
        }

        int count = 0;
        for (int i = 0; i < M; i++) {  // 검사해야하는 문자열
            if (S.containsKey(br.readLine())) { count++; }
        }

        System.out.println(count);
    }

}
