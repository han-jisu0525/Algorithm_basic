package basic5_2;

import java.util.Scanner;

public class total_2721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("");
        String[] b = sc.nextLine().split("");
        String[] c = sc.nextLine().split("");

        if (a[(a.length)-1].equals(b[0]) &&
        b[(b.length)-1].equals(c[0]) && c[(c.length)-1].equals(a[0])) {
            System.out.println("good");
        } else System.out.println("bad");
    }
}
