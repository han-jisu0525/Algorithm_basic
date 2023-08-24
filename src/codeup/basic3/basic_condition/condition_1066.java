package codeup.basic3.basic_condition;

import java.util.Scanner;

public class condition_1066 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int x = sc.nextInt();
       int y = sc.nextInt();
       int z = sc.nextInt();
       int[] a = {x, y, z};

        int i = 0;
        while (i < a.length) {
            if (a[i]%2==0) System.out.println("even");
            else if (a[i]%2==1) System.out.println("odd");
            i++;
        }
    }
}
