package baekjoon.ch9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch9_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            if (a == -1) { break; }

            int[] arr = new int[a];
            int sum = 0;
            int index = 0;

            for (int i = 1; i < a; i++) {
                if (a % i == 0) {
                    arr[index++] = i;
                    sum += i;
                }
            }

            if (sum != a) {
                System.out.println(a + " is NOT perfect.");
                continue;
            }

            System.out.print(a + " = ");
            for (int i = 0; i < index; i++) {
                if (i == index-1) {
                    System.out.println(arr[i]);
                } else {
                    System.out.print(arr[i] + " + ");
                }
            }
        }
    }
}
