package baekjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class ch14_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {  // 듣도 못한 사람
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String tmp = br.readLine();  // 보도 못한 사람
            if (set.contains(tmp)) {  // 보도 못한 사람이 듣도 못한 사람에도 있다면
                result.add(tmp);  // 결과에 추가
            }
        }

        Collections.sort(result);  // 정렬

        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
