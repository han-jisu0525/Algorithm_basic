package basic4_1.total;

import java.util.Scanner;

public class total_1089_1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
//            // 1089
//            start += d;

            // 1090
            start *= d;
        }
        System.out.println(start);


    }
}
