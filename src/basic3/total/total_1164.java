package basic3.total;

import java.util.Scanner;

public class total_1164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if (x <= 170 || y <= 170 || z <= 170) System.out.println("CRASH");
        else System.out.println("PASS");


//        int[] ans = {x, y, z};
//
//        for (int i = 0; i < ans.length; i++) {
//            if (ans[i] > 170) {
//                i++;
//            } else if (ans[i] <= 170) {
//                System.out.println("CRASH"); break;
//            }
//            System.out.println("PASS");
//        }
    }
}
