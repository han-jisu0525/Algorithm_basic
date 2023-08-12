package basic5_3.total;

import java.util.Scanner;

public class total_1524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[10][10];
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;

        if (a[x][y] == -1) System.out.println(-1);
        else {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (a[x+i][y+j] == 1) sum++;
                }
            }
        }
        System.out.println(sum);

    }
}
