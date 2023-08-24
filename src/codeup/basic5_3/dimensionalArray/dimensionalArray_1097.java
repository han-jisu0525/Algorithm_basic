package codeup.basic5_3.dimensionalArray;

import java.util.Scanner;

public class dimensionalArray_1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();

        for (int n = 0; n < N; n++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;

            for (int i = 0; i < 19; i++) {
                if (arr[a][i] == 0) arr[a][i] = 1;
                else arr[a][i] = 0;
            }

            for (int j = 0; j < 19; j++) {
                if (arr[j][b] == 0) arr[j][b] = 1;
                else arr[j][b] = 0;
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }

    }
}
