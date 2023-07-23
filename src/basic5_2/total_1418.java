package basic5_2;

import java.util.Scanner;

public class total_1418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split("");

        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("t")) System.out.printf("%d ", i+1);
        }
    }
}
