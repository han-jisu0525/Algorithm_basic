import java.util.Scanner;

public class total_1224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        a1 *= b2; a2 *= b2;
        b1 *= a2; b2 *= a2;
        if (a1 == b1) System.out.println("=");
        else if (a1 > b1) System.out.println(">");
        else System.out.println("<");
    }
}
