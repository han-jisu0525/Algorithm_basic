package codeup.basic3.total;

import java.util.Scanner;

public class total_1201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x == 0) System.out.println(x);
        else if (x < 0) System.out.println("음수");
        else System.out.println("양수");
    }
}
