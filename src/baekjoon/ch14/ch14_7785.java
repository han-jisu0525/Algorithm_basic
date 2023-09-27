package baekjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ch14_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, String> S = new HashMap<>();

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            S.put(st.nextToken(), st.nextToken());
        }

        String[] arr = new String[S.size()];
        int q = 0;

        // for (A : B) // B에서 차례대로 객체를 꺼내서 A에 넣는다.
        // entrySet: key, value 값 둘 다. keySet: key값만
        for (Map.Entry<String, String> entry : S.entrySet()) {
            if (entry.getValue().equals("leave")) {
                continue;
            } else {
                arr[q++] = entry.getKey();
            }
        }

        String[] sortedList = new String[q];  // enter인 애들로만 배열 구성
        for (int i = 0; i < q; i++) {
            sortedList[i] = arr[i];
        }


        Arrays.sort(sortedList, new Comparator<String>() {
            // 오름차순 정렬
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);  // o2 - o1랑 같음.
            }
        });

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < sortedList.length; i++) {
            sb.append(sortedList[i]+"\n");
        }

        System.out.println(sb);
    }
}
