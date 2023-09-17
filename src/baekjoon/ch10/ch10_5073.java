package baekjoon.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ch10_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());


            if (a==0 && b==0 && c==0) { break; }

            traiangle(a, b, c);
        }
    }

    static void traiangle(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if (arr[2] >= arr[0] + arr[1]) {
            System.out.println("Invalid");
        } else if (a==b && b==c) {
            System.out.println("Equilateral");
        } else if (a==b || b==c || a==c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
