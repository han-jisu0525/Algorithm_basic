package basic5_2;

import java.util.Scanner;

public class total_1990 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char[] y = x.toCharArray();
        int sum = 0;

        for (int i = 0; i < y.length; i++) {
            sum += (y[i]-48);
        }
        if (sum % 3 == 0) System.out.println("1");
        else System.out.println("0");

    }
}
