package codeup.basic5_2;

import java.util.Scanner;

public class total_1419 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        char[] a = x.toCharArray();

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 'l')
                if (a[i+1] == 'o')
                    if (a[i+2] == 'v')
                        if (a[i+3] == 'e') sum++;
        }
        System.out.println(sum);

    }
}
