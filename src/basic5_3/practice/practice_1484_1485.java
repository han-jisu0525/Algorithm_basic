package basic5_3.practice;

import java.util.Scanner;

public class practice_1484_1485 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int limit = 0;
        int reverse = 1;
        int row = 0, col = -1;

        // 1484
//      for (int num = 1; num <= n*m;) { // 수동으로 num++ 해주니까 여기선 필요 X

        // 1485
        for (int num = n*m; num >= 1;) { // +) num++를 num--로 바꿈.
            // 가로 채우기
            for (int i = 0; i < m-limit; i++) {
                col += reverse;
                a[row][col] = num--;
            }
            // 세로 채우기
            for (int j = 0; j < n-limit-1; j++) { // 이미 첫칸이 채워져있기 때문에 limit-1
                row += reverse;
                a[row][col] = num--;
            }
            // 횟수 줄이기 (안쪽으로 계속 돌아가야하니까)
            limit++;
            // 올라갔다 내려갔다 or 왼쪽 오른쪽 (방향키같은 느낌?!)
            reverse = -reverse;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
