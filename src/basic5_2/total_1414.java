package basic5_2;

import java.util.Scanner;

public class total_1414 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split("");

        int sum1 = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals("c") || x[i].equals("C")) sum1++;
        }

        int sum2 = 0;
        for (int i = 0; i < x.length-1; i++) {
            if ((x[i].equals("c") || x[i].equals("C")) &&
                    (x[i+1].equals("c") || x[i+1].equals("C"))) {
                sum2++;
            }
        }
        System.out.printf("%d\n%d", sum1, sum2);

    }
}
