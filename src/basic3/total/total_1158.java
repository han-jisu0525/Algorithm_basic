package basic3.total;

import java.util.Scanner;

public class total_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if ((x>30 && x<40) || (x>60 && x< 70)) System.out.println("win");
        else System.out.println("lose");
    }
}
