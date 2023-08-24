package baekjoon.ch5;

import java.util.Scanner;

public class ch5_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();
        String[] SS = S.split("");

        System.out.printf("%s", SS[i-1]);
    }
}
