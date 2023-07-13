package basic3.total;

import java.util.Scanner;

public class total_1169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age > 13) System.out.println((112-age+1) + " 1");
        else System.out.println((12-age+1) + " 3");
    }
}
