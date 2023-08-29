package baekjoon.ch8;

import java.util.Scanner;

public class ch8_2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String N = input.split(" ")[0];
        int B = Integer.parseInt(input.split(" ")[1]);

        int[] arr = new int[N.length()];
        int sum = 0;

        for (int i = 0; i < N.length(); i++) {
            if (input.charAt(i) >= 'A') {
                arr[i] = input.charAt(i) - 'A' + 10;
            } else {
                arr[i] = input.charAt(i) - '0';
            }
            sum += arr[i] * Math.pow(B, N.length()-i-1);
        }

        System.out.println(sum);
    }
}
