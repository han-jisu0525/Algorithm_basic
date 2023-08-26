package baekjoon.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ch6_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (check() == true) { count++; }
        }
        System.out.println(count);
    }
    public static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            // 앞의 문자와 i번째 문자가 다르다면
            if (prev != now) {
                // 해당 문자가 처음인경우
                if (!check[now - 'a']) {
                    check[now - 'a'] = true;
                    prev = now; // 다음턴을 위해 prev를 변경
                } else {  // 이미 나왔던 문자인 경우 (그룹단어가 아닌 경우)
                    return false;
                }
            } else { // 앞 문자와 i번째 문자가 같다면
                continue;
            }
        }
        return true;
    }
}
