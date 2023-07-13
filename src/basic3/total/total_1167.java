package basic3.total;

import java.util.Arrays;
import java.util.Scanner;

public class total_1167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] ans = new int[]{x, y, z};
        Arrays.sort(ans);
        System.out.println(ans[1]);

    }
}
