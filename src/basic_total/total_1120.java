package basic_total;

import java.util.Scanner;

public class total_1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        double avg = (double) (x + y + z) /3;

        System.out.printf("%.2f", avg);

    }
}
