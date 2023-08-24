package codeup.basic3.total;

import java.util.Scanner;

public class total_1180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int trash = sc.nextInt();

        int new_trash = (trash/10 + (trash%10)*10) * 2;
        if (new_trash >= 100) {
            int bad_trash = new_trash - 100;
            System.out.println(bad_trash);
            if (bad_trash <= 50) System.out.println("GOOD");
            else System.out.println("OH MY GOD");
        }
        else {
            System.out.println(new_trash);
            if (new_trash <= 50) System.out.println("GOOD");
            else System.out.println("OH MY GOD");
        }


    }
}
