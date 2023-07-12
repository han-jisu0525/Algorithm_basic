package basic3.total;

import java.util.Scanner;

public class total_1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if ((x>50 && x<70) || (x % 6 == 0)) System.out.println("win");
        else System.out.println("lose");
    }
}
