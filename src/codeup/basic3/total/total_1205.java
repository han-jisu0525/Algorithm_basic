package codeup.basic3.total;

import java.util.Arrays;
import java.util.Scanner;

public class total_1205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double c = a + b;
        double d = a - b;
        double e = b - a;
        double f = a * b;
        double g = a / b;
        double h = b / a;
        double i = Math.pow(a, b);
        double j = Math.pow(b, a);

        double[] ans = {c, d, e, f, g, h, i, j};
        Arrays.sort(ans);

        System.out.printf("%.6f", ans[ans.length-1]);
    }
}
