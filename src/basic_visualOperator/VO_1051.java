package basic_visualOperator;

import java.io.IOException;
import java.util.Scanner;

public class VO_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x < y) System.out.println("1");
        else System.out.println("0");
    }
}
