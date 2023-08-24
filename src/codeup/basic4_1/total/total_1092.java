package codeup.basic4_1.total;

import java.util.Scanner;

public class total_1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int day = 0;

        for (day = 2; ;day++) {
            if(day%a==0 && day%b==0 && day%c==0) {
                System.out.println(day); break;
            }
        }
    }
}
