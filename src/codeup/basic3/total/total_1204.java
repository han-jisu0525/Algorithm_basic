package codeup.basic3.total;

import java.util.Scanner;

public class total_1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num/10 == 1) {
            System.out.println(num+"th");
        } else {
             if (num%10 == 1) System.out.println(num+"st");
             else if (num%10 == 2) System.out.println(num+"nd");
             else if (num%10 == 3) System.out.println(num+"rd");
             else System.out.println(num+"th");
        }
    }
}
