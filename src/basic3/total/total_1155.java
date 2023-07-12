package basic3.total;

import java.util.Scanner;

public class total_1155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 7 == 0) System.out.println("multiple");
        else System.out.println("not multiple");
    }
}
