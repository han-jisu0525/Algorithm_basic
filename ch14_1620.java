package baekjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ch14_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> mon_int = new HashMap<>();
        Map<String, Integer> mon_str = new HashMap<>();
        for (int i = 1; i <= N; i++) { // 집합 S에 포함되어있는 문자열
            String name = br.readLine();
            mon_int.put(i, name);
            mon_str.put(name, i);
        }

        StringBuilder sb = new StringBuilder();

        while (M --> 0) { // --> : M--; M > 0; 두 개 합친것.
            String findStr = br.readLine();
            if (isStringNumber(findStr)) {  // 숫자면
                sb.append(mon_int.get(Integer.parseInt(findStr)) + "\n");
            } else {
                sb.append(mon_str.get(findStr) + " \n");
            }
        }

        System.out.println(sb);
    }

    private static boolean isStringNumber(String findStr) {
        try {
            Double.parseDouble(findStr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
