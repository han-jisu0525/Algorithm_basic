package baekjoon.ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ch14_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1);  // 이분탐색 할 배열 정렬

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(arr1, N, temp) + " ");
        }

        System.out.println(sb);
    }

    public static int binarySearch(int[] arr1, int N, int search) {  // 이분탐색 함수
        int first = 0;
        int last = N - 1;
        int mid = 0;

        while (first <= last) {
            mid = (first + last) / 2;

            if (arr1[mid] == search) {
                return 1;
            }

            if (arr1[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
    }
}
