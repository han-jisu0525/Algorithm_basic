package basic5_4;

import java.util.Scanner;

public class total_1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int temp = 0;

        if (x >= y) {
            temp = x;
            x = y;
            y = temp;
        }
        if (x >= z) {
            temp = x;
            x = z;
            z = temp;
        }
        if (y >= z) {
            temp = y;
            y = z;
            z = temp;
        }
        System.out.printf("%d %d %d", x, y, z);


    }
}
