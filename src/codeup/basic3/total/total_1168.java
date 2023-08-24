package codeup.basic3.total;

import java.util.Scanner;

public class total_1168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int current = 2012;
        int birth = sc.nextInt();
        int gender = sc.nextInt();

        int year = birth/10000;

        if (gender == 1 || gender == 2) {
            year += 1900;
            System.out.println(current - year + 1);
        } else if (gender == 3 || gender == 4) {
            System.out.println(current - year + 1);
        }
    }
}
