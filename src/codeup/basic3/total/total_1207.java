package codeup.basic3.total;

import java.util.Scanner;

public class total_1207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int yut1 = sc.nextInt();
        int yut2 = sc.nextInt();
        int yut3 = sc.nextInt();
        int yut4 = sc.nextInt();

        int[] yut = new int[]{yut1, yut2, yut3, yut4};
        int rev = 0;

        for (int i : yut) {
            if (i == 1) rev += 1;
        }

        switch (rev) {
            case (0):
                System.out.println("모"); break;
            case (1):
                System.out.println("도"); break;
            case (2):
                System.out.println("개"); break;
            case (3):
                System.out.println("걸"); break;
            case (4):
                System.out.println("윷"); break;
        }
    }
}
