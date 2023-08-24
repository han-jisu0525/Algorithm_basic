package baekjoon.ch5;

import java.util.Scanner;

public class ch5_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = (A/100) + (A/10%10)*10 + (A%10)*100;
        int b = (B/100) + (B/10%10)*10 + (B%10)*100;

        System.out.println(Math.max(a, b));
    }
}
