package baekjoon.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ch10_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = {a, b, c};
        Arrays.sort(arr);
        if (arr[2] < arr[0] + arr[1]) {
            System.out.println(a+b+c);
        } else {
            arr[2] = (arr[0] + arr[1]) - 1;
            System.out.println(arr[0] + arr[1] + arr[2]);
        }
    }
}
