package basic4.total;

import java.util.Scanner;

public class total_1272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int h = sc.nextInt();

        if (k == 1) k = 1;
        else if (k % 2 == 1) k += 1;
        else k *= 5;

        if (h % 2 == 1) h += 2;
        else h *= 5;

        System.out.println(k + h);
    }
}
