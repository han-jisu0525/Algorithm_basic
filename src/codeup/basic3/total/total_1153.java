package codeup.basic3.total;

import java.util.Scanner;

public class total_1153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == y) System.out.println("=");
        else if (x < y) System.out.println("<");
        else System.out.println(">");
    }
}
