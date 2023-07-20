package basic5_1;

import java.util.Scanner;

public class total_1412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "abcdefghijklmnopqrstuvwxyz";
        String[] b = a.split("");
        int[] c = new int[b.length];

        String[] x = sc.nextLine().split("");

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(x[i].equals(b[j])) c[j]++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.printf("%s: %d\n", b[i], c[i]);
        }
    }
}
