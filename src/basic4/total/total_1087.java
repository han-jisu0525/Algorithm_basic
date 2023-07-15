package basic4.total;

import java.util.Scanner;

public class total_1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;

        for (int i = 0; ; i++) {
            sum += i;
            if (sum >= x) {
                System.out.println(sum);
                break;
            }
        }
    }
}
