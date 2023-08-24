package baekjoon.ch5;

import java.util.Scanner;

public class ch5_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] S = new String[T];

        for (int i = 0; i < S.length; i++) {
            S[i] = sc.next();
        }

        for (int i = 0; i < T; i++) {
            System.out.printf("%c%c\n", S[i].charAt(0), S[i].charAt(S[i].length()-1));
        }
    }
}
