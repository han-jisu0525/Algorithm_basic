package basic5_1;

import java.util.Scanner;

public class total_1410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split("");
        int in = 0;
        int out = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("(")) in++;
            else if (x[i].equals(")")) out++;
        }
        System.out.printf("%d %d", in, out);
    }
}
