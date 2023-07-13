package basic3.total;

import java.util.Arrays;
import java.util.Scanner;

public class total_1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int[] ans = new int[]{x, y, z};
        Arrays.sort(ans);

        System.out.printf("%d %d %d\n", ans[0], ans[1], ans[2]);

//        for (int i = 0; i < ans.length; i++) {
//            System.out.print(ans[i]);
//            System.out.print(" ");
//        }
    }
}
