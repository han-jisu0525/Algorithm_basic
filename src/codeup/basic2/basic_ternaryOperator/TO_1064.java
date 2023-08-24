package codeup.basic2.basic_ternaryOperator;

import java.util.Scanner;

public class TO_1064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.println((x>y?x:y)>z?(x>y?x:y):z);
    }
}
