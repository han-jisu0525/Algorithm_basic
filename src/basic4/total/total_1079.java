package ch4;

import java.util.Scanner;

public class total_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            if (x[i].equals("q")) break;
        }
    }
}
