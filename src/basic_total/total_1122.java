package basic_total;

import java.util.Scanner;

public class total_1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.printf("%d %d", x/60, x%60);
    }
}
