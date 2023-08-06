package basic5_3.dimensionalArray;

import java.util.Scanner;

public class dimensionalArray_1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;
        while (true) {
            if (arr[x][y] == 0) {
                arr[x][y] = 9;
                y+=1;
            }
            if (arr[x][y] == 1) {
                y-=1;
                x+=1;
            }
            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
