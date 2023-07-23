package basic5_2;

import java.util.Scanner;

public class total_1754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();

        if (x.length() < y.length()) System.out.printf("%s %s", x, y);
        else if (x.length() == y.length()) {
            if (x.compareTo(y) > 0) {
                System.out.printf("%s %s", y, x);
            } else if (x.compareTo(y) < 0) {
                System.out.printf("%s %s", x, y);
            }
        } else System.out.printf("%s %s", y, x);
    }
}
