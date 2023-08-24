package baekjoon.ch5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ch5_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.println(st.countTokens());
    }
}
