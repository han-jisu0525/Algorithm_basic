package codeup.basic5_3.total;

import java.util.Scanner;

public class total_1513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][n+1];
        int value = 1;
        int Axis = 1;
        for(int i = n; i >= 1; i--){  // 5 4 3 2 1
            // if(i % 2 == 1){
            if(Axis == 1){
                int x = n;
                for(int j = n-i+1; j<=n; j++){
                    a[x--][j] = value++;
                }

                Axis = -1;
            }
            else{
                int x = n-i+1;
                for(int j = n; j>=n-i+1; j--){
                    a[x++][j] = value++;
                }
                Axis = 1;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
