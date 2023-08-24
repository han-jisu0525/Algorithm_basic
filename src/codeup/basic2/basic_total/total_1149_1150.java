package codeup.basic2.basic_total;

import java.util.Scanner;

public class total_1149_1150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(Math.max(x, y));

        // 1150
        int z = sc.nextInt();
        System.out.println(Math.min(Math.min(x,y), Math.min(y,z)));
    }
}
